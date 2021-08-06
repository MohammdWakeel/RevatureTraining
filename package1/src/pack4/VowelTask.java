package pack4;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map.Entry;;

public class VowelTask {
	public static boolean isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			return true;
		return false;
	}
	public static int countVowel(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				count++;
			}
		}
		return count;
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
		
		//Collections.reverse(map);
		String s="Hello my name is Mohammad Wakeel I live is Gonda";
		System.out.println(sort(s));

	}

}
