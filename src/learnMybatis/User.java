package learnMybatis;

import java.util.List;

public class User {
	private int id;
	private String name;
	private int age;
	List<Product> products;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public String toString(){
		return "User [id="+ id +",name="+ name +",age="+ age +"]";
	}

}
