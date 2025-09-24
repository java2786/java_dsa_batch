package demo;

public class ValidPalindrome_125 {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        // e
        while (left < right) {
            if (isNonAlphanumeric(s.charAt(left))) {
                left++;
                continue;
            }
            if (isNonAlphanumeric(s.charAt(right))) {
                right--;
                continue;
            }

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isNonAlphanumeric(char c) {
        // String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // return str.indexOf(c) == -1;
        return Character.isLetterOrDigit(c) == false;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}