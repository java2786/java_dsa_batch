package java03_class_object;

class MyBook{
	String title;
}

public class MultipleObjects {
	public static void main(String[] args) {
		MyBook[] books = new MyBook[100000000];
		for(int i=0;i<100000000;i++) {
//			MyBook b = new MyBook();
			books[i] = new MyBook();
			System.out.println(books[i]);
		}
	}
}
