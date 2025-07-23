package encap;

public class Movie {
	private String name;
	private int price = 500;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name !=null) {			
			this.name = name;
		}
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 250) {
			this.price = price;
		}
	}
	
	
	
//	public void updatePrice(int input) {
//		System.out.println("new price is "+input);
//		if(input > 250) {			
//			price = input;
//		}
//	}
//	
//	public int priceValue() {
//		return price;
//	}
}
