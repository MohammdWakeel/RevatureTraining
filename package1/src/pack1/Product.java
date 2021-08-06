package pack1;
import java.util.*;

public class Product implements Comparable<Product>{
	private int id;
	private String name;
	
	private double cost;
	private float rating;
	private double quantity;
	public Product(int id, String name, double cost, float rating, double quantity) {

		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
		this.quantity = quantity;
	}

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", rating=" + rating + ", quantity="
				+ quantity + "]";
	}

    @Override
    public int compareTo(Product obj) {
    	Integer a=this.id;
    	Integer b=obj.id;
    	return a.compareTo(b);
    }
	
	
	

}
