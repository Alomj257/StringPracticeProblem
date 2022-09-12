package StringPracticeProblem;
import java.util.*;
public class StringIsRotationOfAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = new String();
        System.out.println("Enter first string: ");
        s1 = sc.nextLine();

        String s2 = new String();
        System.out.println("Enter second string: ");
        s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("Second string is not a rotation of first string");
        }

        else{
            s1 = s1.concat(s1);
            if(s1.indexOf(s2) != -1){
                System.out.println("Second string is a rotation of first string");
            }
            else{
                System.out.println("Second string is not a rotation of first string");
            }
        }
        sc.close();
    }
}
