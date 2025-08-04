public class Prime {
    public static void main(String[] args) {
        int n = 97;
        
        // for(int i=2;i<=n/2;i++){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println(n+" is not prime");
                return;
            }
            System.out.println("I: "+i);
        }

        
            System.out.println(n+" is prime number");
        
    }
}
