package StringPracticeProblem;
import java.util.*;

public class RemoveAllTheWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.println("Enter string: ");
        s = sc.nextLine();
        System.out.println(s.length());

        s = s.replaceAll("\\s", "");
        System.out.println(s.length());
        System.out.println(s);
        sc.close();
    }
}
