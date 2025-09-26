package demo;

class Car{
    final public void run(){
        System.out.println("Car is running");
    }

}

class Maruti extends Car{
    // public void run(){
    //     System.out.println("maruti Car is running");
    // }

}


public class Demo {
    public static void main(String[] args) {
        int a = -11;
        int b = 2;

        System.out.println("a/b: "+a/b); // -5
        System.out.println("(double)a/b: "+(double)a/b);
        System.out.println("a/(double)b: "+a/(double)b);
        System.out.println("(double)(a/b): "+ (double)(a/b)); // -5.0
    }
}
