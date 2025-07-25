package java03_class.object;

class Book{
	String title;
	int price;
	String author;
	String publisher;
	String publish_date;
	
	void showDetails() {
		System.out.println("Title: "+title+", Author: "+author+", Price: "+price+", Publisher: "+publisher+", PublishedDate: "+publish_date);	
	}
}

public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.title = "Superman";
		b1.author = "Clark";
		b1.price = 105;
		b1.publish_date = "Chand Publication";
		b1.publish_date = "19May1998";
		
		b2.title = "Hulk";
		b2.author = "Bruce";
		b2.price = 89;
		b2.publish_date = "Suraj Publication";
		b2.publish_date = "13Oct1996";
		
//		System.out.println("Title: "+b1.title+", Author: "+b1.author+", Price: "+b1.price+", Publisher: "+b1.publisher+", PublishedDate: "+b1.publish_date);
//		System.out.println("Title: "+b2.title+", Author: "+b2.author+", Price: "+b2.price+", Publisher: "+b2.publisher+", PublishedDate: "+b2.publish_date);
		
		b1.showDetails();
		b2.showDetails();
		b3.showDetails();
	}
}
