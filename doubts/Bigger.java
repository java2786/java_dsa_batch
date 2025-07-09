public class Bigger {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        int c = 7;

        if(a<b){
            if(b<c){
                System.out.println("Largest number is "+c);
            } else {
                System.out.println("Largest number is "+b);
            }
        } else {
            if(a>c){
                System.out.println("Largest number is "+a);
            } else {
                System.out.println("Largest number is ++++ "+c);
            }
        }
    }
}
