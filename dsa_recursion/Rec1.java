public class Rec1{
    int num = 1;
    public static void main(String[] args) {
        Rec1 obj = new Rec1();
        obj.show();
    }
    
    void show(){
        // base case
        if(num == 10){
            return;
        }
        System.out.println("Number "+num++);
        show();
    }
}