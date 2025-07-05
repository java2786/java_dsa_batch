// Declare a variable for temperature in Celsius and 
// print it in the format: “Today's temperature is 36°C.”

public class Temp{
    public static void main(String[] args) {
        int temp = 37;
        System.out.println("Today's temperature is "+temp+"°C.");

        double f_temp = 0;
        f_temp = (temp * 9/5) + 32;
        // Convert into Farenheite
        System.out.println("Today's temperature is "+f_temp+"°F.");
    }
}