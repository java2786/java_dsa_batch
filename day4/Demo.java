// A student is allowed to sit in exam if attendance is >=75%. 
// Input total classes and attended classes and print eligibility.
public class Demo {
    public static void main(String[] args) {
        int totalClasses = 180;
        int attended = 135;
     
        
        // int attendance = (attended*100/totalClasses); 
        double attendance = (attended*100.0/totalClasses); 
        System.out.println(attendance);

        if(attendance >= 75){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
