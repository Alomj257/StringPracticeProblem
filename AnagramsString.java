package StringPracticeProblem;
import java.util.*;
import java.util.Arrays;

public class AnagramsString {
    public static void main(String[] args) {
        String s = new String();
        String s1 = new String();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two String: ");
        s = sc.nextLine();
        s1= sc.nextLine();

        s = s.toLowerCase();
        s1 = s1.toLowerCase();

        if(s.length() != s1.length()){
            System.out.println("Both string are not anagram");
        }
        else{
            char [] a = s.toCharArray();
            char [] a1 = s1.toCharArray();

            Arrays.sort(a);
            Arrays.sort(a1);

            if(Arrays.equals(a,a1) == true){
                System.out.println("Both String are anagram");
            }
            else{
                System.out.println("Both string are not anagram");
            }
        }
        sc.close();
    }
}
