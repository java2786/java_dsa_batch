public class StrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int copy = num;
        int result = 0;
        // 1 + 24 + 120 = 145

        while(num > 0){
            int n = num % 10;
            int fact = getFactorial(n);
            result = result + fact;
            // System.out.println("N: "+n+", Result: "+result);
            num = num / 10;
        }
        if(result == copy){
            System.out.println(copy+" is strong number");
        } else {
            System.out.println(copy+" is not strong number");
        }

    }

    static int getFactorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
}
