package StringPracticeProblem;
import java.util.*;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.println("Enter string: ");
        s = sc.nextLine();

        String rev = "";
        int l = s.length();

        for(int i=l-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }

        System.out.println("Reverse string:");
        System.out.println(rev);
        sc.close();
    }
}
