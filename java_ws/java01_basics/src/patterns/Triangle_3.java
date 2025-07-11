package patterns;

public class Triangle_3 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=n;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(". ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


