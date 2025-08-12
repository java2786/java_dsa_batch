public class Rec10_dtob {
    public static void main(String[] args) {
        System.out.println("Binary of 4: "+decimalToBinary(4)); // 100
        System.out.println("Binary of 3: "+decimalToBinary(3)); //11 
        System.out.println("Binary of 7: "+decimalToBinary(7)); // 111
        System.out.println("Binary of 10: "+decimalToBinary(10)); // 1010

        System.out.println("Decimal of 100: "+binaryToDecimal(100, 0));
        System.out.println("Decimal of 11: "+binaryToDecimal(11, 0));
        System.out.println("Decimal of 111: "+binaryToDecimal(111, 0));
        System.out.println("Decimal of 101: "+binaryToDecimal(101, 0));
        System.out.println("Decimal of 1010: "+binaryToDecimal(1010, 0));
    }

    static int decimalToBinary(int n){
        // base case
        if(n==0){
            return 0;
        }
        // System.out.println("Input: "+n+", rem: "+n%2);
        int r = decimalToBinary(n/2);
        return r*10 + n%2;
    }

    static int binaryToDecimal(int num, int index){
        if(num==0){
            return 0;
        }
        int r = binaryToDecimal(num/10, index+1);
        return r + (int)Math.pow(2,index)*num%10;
    }
}
