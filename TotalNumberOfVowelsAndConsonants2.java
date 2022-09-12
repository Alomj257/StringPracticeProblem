package StringPracticeProblem;
import java.util.*;

public class TotalNumberOfVowelsAndConsonants2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.print("Enter the string: ");
        s = sc.nextLine();

        s = s.toLowerCase();
        s = s.replaceAll("\\s", "");
        int l = s.length();

        int vCount = 0, cCount = 0;
        for(int i=0; i<l; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vCount++;
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                cCount++;
            }
        }
        System.out.println("Total numbers of vowels: " +vCount);
        System.out.println("Total number of consonents: " +cCount);
        
        sc.close();
    }
}
