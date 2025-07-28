package java04_class_object;

public class Demo {
	public static void main(String[] args) {
		Book book = new Book();
//		book.price = -2234;
		book.setPrice(-2234);
//		System.out.println(book.price);
		System.out.println(book.getPrice());

		
		Book book2 = new Book(500, "Nature in Future", "Ramesh");
//		book2.setPrice(500);
//		book2.setAuthor("Ramesh");
//		book2.setTitle("Nature in Future");
//		book2.fillBook(500, "Nature in Future", "Ramesh");

//		System.out.println("Book[Title: "+book2.getTitle()+", Author: "+book2.getAuthor()+", Price: "+book2.getPrice()+"]");
//		book2.showBook();
//		System.out.println(book2.showBook());
		System.out.println(book2);
		
		Book book3 = new Book(550, "Hire a fire", "Mahesh");
//		book3.setPrice(550);
//		book3.setAuthor("Mahesh");
//		book3.setTitle("Hire a fire");
//		book3.fillBook(550, "Hire a fire", "Mahesh");
		
//		System.out.println("Book[Title: "+book3.getTitle()+", Author: "+book3.getAuthor()+", Price: "+book3.getPrice()+"]");
//		book3.showBook();
//		System.out.println(book3.showBook());
		System.out.println(book3.toString());
		
		Book book4 = new Book(325, "How to drive", "Dinesh");
//		book4.setPrice(325);
//		book4.setAuthor("Dinesh");
//		book4.setTitle("How to drive");
//		book4.fillBook(325, "How to drive", "Dinesh");
		
//		System.out.println("Book[Title: "+book4.getTitle()+", Author: "+book4.getAuthor()+", Price: "+book4.getPrice()+"]");
//		book4.showBook();
//		System.out.println(book4.showBook());
		System.out.println(book4);
		
		
		Book book5 = new Book(350, "Train your Brain", "GuruJi");
		book5.setAuthor("RameshBabu");
		System.out.println(book5);
	}
}


// Title: Hire a fire, Author: Mahesh, Price: 550
