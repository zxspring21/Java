
public class Person {
	
	private String name;
	private String age;
	private int height;
	private int weight;
	
	public Person() {
		
	}
	
	public Person(String name, String age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAge() {
		return this.age;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void showProfile() {
		System.out.println("姓名:" + this.name);
		System.out.println("年齡:" + this.age);
		System.out.println("身高:" + this.height);
		System.out.println("體重:" + this.weight);
	}
	
}
