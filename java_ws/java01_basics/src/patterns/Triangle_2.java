package patterns;

public class Triangle_2 {
	public static void main(String[] args) {
		int n = 5;
		char ch;
		for(int i=1;i<=n;i++) {
			ch = 65;
			for(int j=1;j<=i;j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}


