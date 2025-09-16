public class D14_subsequence {
    
    public static boolean isSubsequence(String small, String big) {
        // small
        int i = 0;
        // big
        for(int j=0;j<big.length() && i<small.length() ;j++){
            if(small.charAt(i)==big.charAt(j)){
                i++;
            } 
        }
        
        return small.length()==i;
    }

    public static void main(String[] args) {
        boolean result = isSubsequence("abcm", "kadebfgcm");
        System.out.println("Result: "+result);
    }
    public static void main2(String[] args) {
        D14_subsequence obj1 = new D14_subsequence();
        System.out.println(obj1.a);
        obj1.a = 70;
        D14_subsequence obj2 = new D14_subsequence();
        System.out.println(obj2.a);
        System.out.println(D14_subsequence.a);
    }
        static int a = 0;
}


