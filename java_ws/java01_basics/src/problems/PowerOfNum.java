package problems;

public class PowerOfNum {
	public static void main(String[] args) {
		// power
		int a = 4;
		int b = 3;
		int result = 1;
		// 4^3 = 1 * 4 * 4 * 4
		while(b>0) {
			result = result * a;
			b--;
		}
		
		System.out.println(result);
	}
}
