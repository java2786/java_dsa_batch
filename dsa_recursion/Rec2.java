public class Rec2 {
    public static void main(String[] args) {
        Rec2 rec = new Rec2();
        rec.printName(0);
    }

    void printName(int num){
        // base case
        if(num == 5){
            return;
        }
        printName(num);
        System.out.println("Arun: "+ num++);
    }
}
