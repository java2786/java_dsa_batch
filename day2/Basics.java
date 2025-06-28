public class Basics {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a+" is greater than "+b+": "+(a>b));
        // =, ==, !=, ===
        // conditional operators
        // >, <, <=,>=, ==, ===

        // construct - if else
        if(a > b){
            System.out.println(a+" is greater than "+b);
        } 
        if(a<b){
            System.out.println(a+" is lesser than "+b);
        }
        if(a==b){
            System.out.println(a+" and "+b+" are same");
        }
    }
}
