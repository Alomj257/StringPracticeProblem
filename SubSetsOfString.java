package StringPracticeProblem;
import java.util.*;

public class SubSetsOfString {
    public static void main(String[] args) {
        String s = new String();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        s = sc.nextLine();

        int temp = 0;
        int l = s.length();
        int len = (l*(l+1))/2;

        String [] arr = new String[len];
        for(int i=0; i<l; i++ ){
            for(int j=i; j<l; j++){
                arr[temp] = s.substring(i, j+1);
                temp++;
            }
        }
        System.out.println("All subsets for given string are: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
