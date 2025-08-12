public class Rec3 {
    int n = 1;
    public static void main(String[] args) {
        Rec3 obj = new Rec3();
        obj.printNum();
    }

    void printNum(){
        if(n==10){
            return;
        }
        System.out.println(n);
        n++;
        printNum();
        
    }
}
