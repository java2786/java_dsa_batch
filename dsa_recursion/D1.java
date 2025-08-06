public class D1 {
    public static void main(String[] args) {
        D1 obj = new D1();
        obj.methodB();
        System.out.println("Bye Bye");
    }
    void methodA(){
        System.out.println("In A");
        methodC();
    }
    void methodB(){
        System.out.println("In B");
        methodA();
        System.out.println("Ending B");
    }
    void methodC(){
        System.out.println("In C");
    }
}
