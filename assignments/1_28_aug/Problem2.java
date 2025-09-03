public class Problem2 {
    public static void main(String[] args) {
        String str = "mission";
        String output = removeChars(str);
        System.out.println(output); // 
    }


    public static String removeChars(String str){
        // base case
        if(str==null){
            return "";
        }
        if(str.length()==0){
            return "";
        }

        // logic => recursion call end => tail recursion
        char c = str.charAt(0);

        // recursion calling - small problem
        String result = removeChars(str.substring(1));

        if(result.length()>0 && result.charAt(0)==c){
            return result.substring(1);
        } else {
            return c + result;
        }
    }
}
