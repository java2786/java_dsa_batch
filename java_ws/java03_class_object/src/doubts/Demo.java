package doubts;

class Samosa{
	int price;
	String item1 = "aloo";
	String item2 = "maida";
	String item3 = "namak";
	
	void prepare(){
		System.out.println("Mix all items: "+item1+", "+", "+item3);
		System.out.println("Mix water in "+item2+" and make dough");
		System.out.println("Fill mixture in dough");
		System.out.println("Fry");		
	}
	void set(int p) {
		price = p;
	}
}

public class Demo {
	public static void main(String[] args) {
		Samosa obj = new Samosa();
		
		obj.prepare();
		obj.set(15);
		
		System.out.println(obj.price);
	}
}
