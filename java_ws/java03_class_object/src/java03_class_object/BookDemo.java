package java03_class_object;

class Book {
	int pages = 43;
	String title = "Superman";
	String author = "Clark";
	int price = 89;
	
	void readFirstPage() {
		System.out.println("reading first page");
	}
}

public class BookDemo {
	public static void main(String[] args) {
		Book b = new Book();
		System.out.println(b);
		System.out.println("Name: "+b.title);
		System.out.println("Price: "+b.price);
		
		b.price = -100;
		System.out.println("Price: "+b.price);
		
	}
}
