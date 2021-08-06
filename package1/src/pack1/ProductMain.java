package pack1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(110,  "Trousers",   1000, 3.4f, 130));
		productList.add(new Product(101,  "T-Shirts", 1450, 2.4f, 150));
		
		productList.add(new Product(122,  "Sleeper",    1000, 3.7f, 230));
		productList.add(new Product(103,  "Shirts", 2100, 4.4f, 430));
		productList.add(new Product(144,  "Chinos",   2250, 4.0f, 530));
		productList.add(new Product(125,  "Shoes",    3500, 3.7f, 730));
		productList.add(new Product(102,  "Jeans",  1450, 3.4f, 530));
		
		
		display(productList);
		
	    Collections.sort(productList);
	    System.out.println("Printing products sorting based on id");
	    display(productList);
	    
	    Collections.sort(productList,(Product obj1,Product obj2)->{
	    	String s1=obj1.getName();
	    	String s2=obj2.getName();
	    	return s1.compareTo(s2);
	    });
	    System.out.println("Printing products sorting based on Name");
	    display(productList);
	    
	    Collections.sort(productList, (Product obj1, Product obj2) -> {
	    	Float f1=obj1.getRating();
	    	Float f2=obj2.getRating();
	    	int x=f1.compareTo(f2);
	    	if(x==0) {
	    		Double d1=obj1.getCost();
	    		Double d2=obj2.getCost();
	    		x=d1.compareTo(d2);
	    	}
	    	return x;
	    });
	    
	    System.out.println("Printing products sorting based on rating & if rating same sort based on cost: ");
	    display(productList);
	    
	    Collections.sort(productList,(Product obj1, Product obj2)->{
	    	Double d1=obj1.getQuantity();
	    	Double d2=obj2.getQuantity();
	    	return d1.compareTo(d2);
	    });
	    
	    System.out.println("Printing products sorting based on quantity: ");
	    display(productList);
		
		
	}
	public static void display(List<Product> productList) {
		for(Product p:productList) {
			System.out.println(p);
		}
	}

}
