public class Rec11 {
    // 261 -> two six one
    // 824 -> eight two four
    public static void main(String[] args) {
        System.out.println(numName(7139));
    }
    static String numName(int num){
        // base case
        if(num == 0){
            return "";
        }
        // small problem
        String result = numName(num/10);

        // logic
        int n = num%10;
        switch (n){
            case 0:
            result = result + "zero";
            break;
            case 1:
            result = result + "one";
            break;
            case 2:
            result = result + "two";
            break;
            case 3:
            result = result + "three";
            break;
            case 4:
            result = result + "four";
            break;
            case 5:
            result = result + "five";
            break;
            case 6:
            result = result + "six";
            break;
            case 7:
            result = result + "seven";
            break;
            case 8:
            result = result + "eight";
            break;
            case 9:
            result = result + "nine";
            break;
        }
        result = result + " ";
        return result;
    }
}
