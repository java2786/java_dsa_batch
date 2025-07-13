package problems;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// 145 -> 1^3 + 4^3 + 5^3 = 1 + 64 + 125 = 190
		// 153 -> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
		// 9 -> 9^1 = 9
		
		// count digits
		// each digit power count
		// sum
				
		int n = 153;
		int copy = n;
		int count = 0;
		int sum = 0;
		
		while(n>0) {
			n = n / 10;
			count++;			
		}
		System.out.println("Count: "+count);
		
		
		n = copy;
		while(n>0) {
	//		int pow = Math.pow(n%10, count);
			
			// power
			int a = n%10;
			n = n/10;
			int b = count;
			int pow = 1;
			while(b>0) {
				pow = pow * a;
				b--;
			}
			sum = sum + pow;
			// System.out.println("pow: "+pow);
		}
		System.out.println("Sum: "+sum);
		n = copy;
		if(n==sum) {
			System.out.println(n+" is Armstrong number");
		} else {
			System.out.println(n+" is not Armstrong number");
		}
	}
}
