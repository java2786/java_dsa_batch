package patterns;

public class Triangle_doubt_2 {
	public static void main(String[] args) {
		int n = 8;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n && j==n) {
					System.out.print("  ");
				}
				else if(i==1 || i==n || j==n){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==n){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
