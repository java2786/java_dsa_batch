public class Rec5 {
    int n = 1;
    public static void main(String[] args) {
        Rec5 obj = new Rec5();
        obj.printOdds();
    }

    void printOdds(){
        if(n==10){
            return;
        }
        
        if(n%2!=0){
            System.out.println(n);
        }
        n++;
        printOdds();
        
    }
}
