public class Rec7 {
    public static void main(String[] args) {
        Rec7 obj = new Rec7();
        obj.power(3, 5, 1);
    }

    void power(int num, int pow, int result){
        // base case 
        if(pow==0){
            System.out.println(result);
            return;
        }
        result = result * num;
        power(num, pow-1, result);
    }
}
