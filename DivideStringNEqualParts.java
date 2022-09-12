package StringPracticeProblem;
import java.util.*;

public class DivideStringNEqualParts {
    public static void main(String[] args) {
        String s = new String();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        s = sc.nextLine();
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int part = s.length()/n;

        if(s.length()%n != 0){
            System.out.println("String can not be divided into n parts");
        }
        else{
            for(int i=0; i<s.length(); i++){
                if(i%part == 0){
                    System.out.println();
                }
                System.out.print(s.charAt(i));
            }
        }
        sc.close();
    }
}
