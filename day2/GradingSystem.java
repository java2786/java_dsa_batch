public class GradingSystem {
    public static void main(String[] args) {
        int score = 68;

        // 85 -> A Grade
        // 60 -> B Grade
        // 50 -> C Grade
        // 40 -> D Grade
        // -> Fail

        if(score >= 85){
            System.out.println("A Grade");
        } else
        if(score >= 60 && score < 85){
            System.out.println("B Grade");
        } else
        if(score >= 50 && score < 60){
            System.out.println("C Grade");
        } else
        if(score >= 40 && score < 50){
            System.out.println("D Grade");
        } else
        if(score < 40) {
            System.out.println("Fail");
        }
    }
    public static void main_1(String[] args) {
        int score = 68;

        // 85 -> A Grade
        // 60 -> B Grade
        // 50 -> C Grade
        // 40 -> D Grade
        // -> Fail

        if(score >= 85){
            System.out.println("A Grade");
        } else
        if(score >= 60){
            System.out.println("B Grade");
        } else 
        if(score >= 50){
            System.out.println("C Grade");
        } else
        if(score >= 40){
            System.out.println("D Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
