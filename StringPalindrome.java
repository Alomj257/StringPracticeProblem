package StringPracticeProblem;
import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.println("Enter the string: ");
        s = sc.nextLine();

        int l = s.length();
        String rev = "";

        for(int i=l-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse string:");
        System.out.println(rev);

        if(s.equals(rev)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
        sc.close();
    }
}
