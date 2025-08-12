public class Rec9 {
    public static void main(String[] args) {
        findZeros(10001, 0);// 2


        int r = findZeros2(10001, 0);// 2
        System.out.println(r);
    }
    static void findZeros(int num, int zeros){
        if(num==0){
            System.out.println(zeros);
            return;
        }
    
        if(num%10==0){
            zeros++;
        }
        num = num/10;
        findZeros(num, zeros);
    }
    static int findZeros2(int num, int zeros){
        if(num==0){
            return zeros;
        }
    
        if(num%10==0){
            zeros++;
        }
        num = num/10;
        return findZeros2(num, zeros);
    }
}
