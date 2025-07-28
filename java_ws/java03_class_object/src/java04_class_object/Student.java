package java04_class_object;

public class Student {
	private int roll;
	private String name;
	private String address;
	private int age;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	public Student(int roll, String name, String address, int age) {

		this.roll = roll;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public Student() {
	}
	
	
	
}
