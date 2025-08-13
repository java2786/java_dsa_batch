public class Rec12 {
    // 0036
    // 4532
    // 0*4 + 0*5 + 3*3 + 6*2 = 21

    public static void main(String[] args) {
        // productDigit(36, 4532, 0);
        int r = productDigit2(36, 4532, 0);
        System.out.println(r);
    }

    static void productDigit(int num1, int num2, int answer){
        // base case 
        if(num1==0 || num2==0){
            // System.out.println(answer);
            return;
        }

        // logic
        answer = answer + ((num1%10) * (num2%10));

        // small problem
        productDigit(num1/10, num2/10, answer);
    }
    static int productDigit2(int num1, int num2, int answer){
        // base case 
        if(num1==0 || num2==0){
            System.out.println(answer);
            return answer;
        }

        // logic
        answer = answer + ((num1%10) * (num2%10));

        // small problem
        return productDigit2(num1/10, num2/10, answer);
    }
}
