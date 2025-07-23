public class CountOddEven{
    public static void main(String[] args) {
        int n = 2413567; 
        int odds = 0;
        int evens = 0;

        while(n>0){
            int ld = n%10; // 3
            n = n/10; // 214

            if(ld%2==0){
                evens++;
            }else {
                odds++;
            }
        }
        
        System.out.println("Evens: "+evens);
        System.out.println("Odds: "+odds);
    }
}