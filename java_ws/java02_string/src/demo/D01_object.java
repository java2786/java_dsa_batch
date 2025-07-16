package demo;

public class D01_object {
	public static void main(String[] args) {
		String a = "Ram";
		String b = new String("Ram");
		String c = "Ram";
		
//		int a = 5;
//		int b = new Integer(5);
//		int c = 5;
		
		if(a == b) {
			System.out.println("a and b are same");
		} else {
			System.out.println("a and b are not same");
		}
		if(a == c) {
			System.out.println("a and c are same");
		} else {
			System.out.println("a and c are not same");
		}
		if(b == c) {
			System.out.println("b and c are same");
		} else {
			System.out.println("b and c are not same");
		}
		
		
		if(a.equals(b)) {
			System.out.println("values of a and b are same");
		} else {
			System.out.println("a and b are different values");
		}
	}
}
