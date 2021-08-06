package pack5;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
public class CountVowel {
	
	
	public static int countVowel(String str) {
		//int count=0;
		int a=0,e=0,i=0,o=0,u=0;
		for(char ch:str.toLowerCase().toCharArray()) {
			if(ch=='a') {
				a=1;
			}
			else if(ch=='e') {
				e=1;
			}
			else if(ch=='i') {
				i=1;
			}
			else if(ch=='o') {
				o=1;
			}
			else if(ch=='u') {
				u=1;
			}
		}
		return a+e+i+o+u;
	}
	public static String sort(String str) {
		Map<Integer, String> map=new TreeMap<>(Collections.reverseOrder());
		String s[]=str.split(" ");
		Arrays.sort(s);
		for (String w : s) {
			int length=countVowel(w);
			if(map.containsKey(length)) {
				String temp=map.get(length);
				temp=temp+" "+w;
				map.put(length, temp);
			}else {
				map.put(length, w);
			}
		}  
		System.out.println("map : "+map);
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer, String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		String str="my I is is Gonda Hello live name Mohammad Wakeel";
		System.out.println(sort(str));
	}

}
