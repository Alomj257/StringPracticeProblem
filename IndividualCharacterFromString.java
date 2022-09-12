package StringPracticeProblem;
import java.util.*;

public class IndividualCharacterFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s= new String();
        System.out.println("Enter String: ");
        s = sc.nextLine();

        s = s.replaceAll("\\s", "");

        System.out.println("Individual character from a given string are: ");
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i) +" ");
        }
        sc.close();
    }
}
