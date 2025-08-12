
public class Rec8_Table {
    public static void main(String[] args) {
        printTable(5, 10);
    }
    static void printTable(int n, int i){

        // base case
        if(i<=0){
            System.out.println("Start falling");
            return;
        }
        // logic
        System.out.println(n+"*"+i+"="+(n*i));

        // small problem
        printTable(n, i-1);

        // logic
        System.out.println(n+"*"+i+"="+(n*i));
        
    }
}
