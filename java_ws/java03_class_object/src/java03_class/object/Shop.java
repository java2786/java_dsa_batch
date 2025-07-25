package java03_class.object;

public class Shop {
	public static void main(String[] args) {
		int mangoBill = 250;
		int bananaBill = 60;
		
		Calculator c = new Calculator();
		c.add(mangoBill, bananaBill);
	}
}
