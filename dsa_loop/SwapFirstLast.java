public class SwapFirstLast{
    public static void main(String[] args) {
        int num = 12345;
        int last = num % 10; // 5
        num = num / 10; // 1234

        int copy = num;
        int digits = 0;
        while(num>0){
            num = num/10; // 0
            digits++; // 4
        }
        num = copy;
        
        int divisor = 1; // 1000
        for(int i=1;i<digits;i++){
            divisor = divisor * 10;
        }

        int mid = num % divisor;
        int first = num / divisor;

        int r = (last * divisor * 10) + (mid * 10) + first;
        System.out.println(r);
    }
}