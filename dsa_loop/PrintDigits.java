public class PrintDigits {
    public static void main(String[] args) {
        int num = 123456;//0
        int copy = num;

        int digitCount = 0;//4
        while(num>0){
            digitCount++;
            num = num/10;
        }
        num = copy;

        int divisor = 1;
        while(digitCount>0){
            digitCount--;
            divisor = divisor * 10;
        }
        divisor = divisor/10; // 1000

        while(num>0){
            System.out.println(num / divisor);
            num = num % divisor; 
            divisor = divisor/10; 
        }

    }



}
