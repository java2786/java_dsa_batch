package encap;

public class PlaceOrder {
	public static void main(String[] args) {
//		Movie m1 = new Movie();
//		m1.name = "Bahubali";
//		m1.price = -250;
////		m1.updatePrice(-250);
//		
//		System.out.println("You are purchasing movie ticket");
//		System.out.println("Name: "+m1.name);
//		System.out.println("Price: "+m1.price);
////		System.out.println("Price: "+m1.priceValue());

		Movie m2 = new Movie();
		System.out.println("Name: "+m2.getName());
		System.out.println("Price: "+m2.getPrice());
		
		m2.setName("Andaz Apna Apna");
		m2.setPrice(300);
		System.out.println("Name: "+m2.getName());
		System.out.println("Price: "+m2.getPrice());
		
		
	}
}
