public class Rec6 {
    public static void main(String[] args) {
        int n = 12345;
        /*
        1 
        2 
        3 
        4 
        5 
        */ 
        Rec6 obj = new Rec6();
        obj.printNum(n);
    }
    void printNum(int num){
        if(num==0){
            return;
        }
        printNum(num/10);
        System.out.println(num%10);

    }
}
