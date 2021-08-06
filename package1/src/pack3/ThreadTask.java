package pack3;
public class ThreadTask {
   //private static final long SLEEP_INTERVAL = 3000;
   private boolean running = true;
   private Thread thread;
   public void start() {
      print("Inside start() method");
      thread = new Thread(new Runnable() {
         @Override
         public void run() {
            print("Inside run() method");
            try {
               Thread.sleep(3000);
            } catch(InterruptedException e) {
               Thread.currentThread().interrupt();
            }
            synchronized(ThreadTask.this) {
               running = false;
               ThreadTask.this.notify();
            }
         }
      });
      thread.start();
   }
   public void join() throws InterruptedException {
      print("Inside join() method");
      synchronized(this) {
         while(running) {
            print("Waiting for the peer thread to finish.");
            wait();
         }
         print("Peer thread finished.");
      }
   }
   private void print(String s) {
      System.out.println(s);
   }
   public static void main(String[] args) throws InterruptedException {
      ThreadTask test = new ThreadTask();
      test.start();
      test.join();
   }
}