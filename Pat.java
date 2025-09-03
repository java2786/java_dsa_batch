public class Pat{
    public static void main(String[] args) {
        int a=1;
        int n=5;
        for (int i=0;i<=n; i++) {
            for (int j=0;j<=i; j++) {
                System.out.print(a++ +"\t");
            }
            System.out.println();
        }
    }
}