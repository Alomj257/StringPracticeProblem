package StringPracticeProblem;
import java.util.*;

public class TotalNumberOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.print("Enter String: ");
        s = sc.nextLine();
        int count =0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) !=' '){
                count ++;
            }
        }
        sc.close();

        System.out.println("Total number of character in a string: " +count);
    }
}
