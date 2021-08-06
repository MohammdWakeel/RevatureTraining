package pack2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ProductSetMain {

	public static void main(String[] args) {
		
		Set<ProductSet> productSet = new HashSet<>();
		productSet.add(new ProductSet(110,  "Trousers",   1000, 3.4f, 130));
		productSet.add(new ProductSet(101,  "SportShoes", 1450, 2.4f, 150));
		productSet.add(new ProductSet(101,  "T-Shirts", 1450, 2.4f, 150));
		productSet.add(new ProductSet(101,  "T-Shirts", 1450, 2.4f, 150));
		productSet.add(new ProductSet(122,  "Sleeper",    1000, 3.7f, 230));
		productSet.add(new ProductSet(103,  "Shirts", 2100, 4.4f, 430));
		productSet.add(new ProductSet(144,  "Chinos",   2250, 4.0f, 530));
		productSet.add(new ProductSet(125,  "Shoes",    3500, 3.7f, 730));
		productSet.add(new ProductSet(120,  "Jeans",  1450, 3.4f, 530));
		
		
		//display(productList);
	    
	    System.out.println("Printing products sorting based on quantity: ");
	    display(productSet);
		
		
	}
	public static void display(Set<ProductSet> productSet) {
		for(ProductSet p:productSet) {
			System.out.println(p);
		}
	}

}
