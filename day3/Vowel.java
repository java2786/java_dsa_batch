// Input a character and check if it's a vowel or consonant.

public class Vowel {
    public static void main(String[] args) {
        // String str = "a";
        // System.out.println(str.length());
        
        char ch = 'e';
        if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }

        System.out.println("Switch case: ");

        switch (ch) {
            default:
                System.out.println("Consonent");
                break;
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
        }
    }
}
