public class Rec4 {
    int n = 1;
    int sum = 0;
    public static void main(String[] args) {
        Rec4 obj = new Rec4();
        obj.sumNum();
    }

    void sumNum(){
        if(n>10){
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        n++;
        sumNum();
        
    }
}
