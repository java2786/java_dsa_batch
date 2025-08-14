public class Rec13_btd {
    public static void main(String[] args) {
        binaryToDecimal(100, 0, 0);// 4
        binaryToDecimal(101, 0, 0);// 5
        binaryToDecimal(1010, 0, 0);// 10
    }
    static void binaryToDecimal(int num, int index, int sum){
        // base case
        if(num==0){
            System.out.println(sum);
            return;
        }
        int ld = num%10;
        sum = sum + (int)(Math.pow(2, index))*ld; 

        binaryToDecimal(num/10, index+1, sum);
    }
}
