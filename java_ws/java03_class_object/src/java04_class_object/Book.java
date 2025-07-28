package java04_class_object;

public class Book {
	private int price = 99;
	private String title;
	private String author;
	
	public Book() {}
	public Book(int p, String t, String a) {
		price = p;
		title = t;
		author = a;
	}
	
	
	public void fillBook(int p, String t, String a) {
		price = p;
		title = t;
		author = a;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>=100) {
			this.price = price;
		}
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
//	public void showBook() {
//		System.out.println("Book=>[Title: "+getTitle()+", Author: "+getAuthor()+", Price: "+getPrice()+"]");
//	}
	public String showBook() {
		return "Book=>[Title: "+getTitle()+", Author: "+getAuthor()+", Price: "+getPrice()+"]";
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", title=" + title + ", author=" + author + "]";
	}

	
}
