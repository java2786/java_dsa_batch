public class Comparison{
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

        if(a>b){
            if(a>c){
                System.out.println("Greatest is "+a);
            } else {
                System.out.println("Greatest is "+c);
            }
        } else if(a<b){
            if(b>c){
                System.out.println("Greatest is "+b);
            } else {
                System.out.println("Greatest is "+c);
            }
        } else {
            if(a>c){
                System.out.println("Greatest is "+a);
            } else {
                System.out.println("Greatest is "+c);
            }

        }

    }
}