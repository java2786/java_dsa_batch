public class Doubts {
    public static void main(String[] args) {
        myPower(2, 4, 1);
    }
    static void myPower(int num, int power, int result){
        if(power==0){
            System.out.println(result);
            return;
        }
        myPower(num, power-1, result*num);
    }
}
