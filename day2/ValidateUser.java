public class ValidateUser {
    public static void main(String[] args) {
        int age = 45;

        // 18 -> 
        // 75 <

        if(age >= 18 && age <=75){
            System.out.println("You are valid for license");
        } else {
            System.out.println("You are not valid for license");
        }

        if(age < 18 || age >75){
            System.out.println("You are not valid for license");
        } else {
            System.out.println("You are valid for license");
        }

    }
}
