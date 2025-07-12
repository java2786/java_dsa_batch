package problems;

public class CountDigit {
	public static void main(String[] args) {
		int n = 765432;
//		String name = "Mathematics";
//		
//		System.out.println("Length of name: "+name.length());
//		System.out.println("Upper of name: "+name.toUpperCase());
//		System.out.println("Length of num: "+n.length());
		
		
		int count = 0;
		
		while(n>0) {			
			n = n/10;
			count++;
		}
		System.out.println(count);
		
		
	}
}
/*
Reverse
Palindrome
Armstrong
Strong
*/
