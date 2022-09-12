package StringPracticeProblem;
import java.util.*;

public class DuplicateCharacterInGivenString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.println("Enter String: ");
        s = sc.nextLine();

        s = s.replaceAll("\\s", "");
        int len = s.length();
        System.out.println(s);

        char [] arr = new char[len];
        arr = s.toCharArray();

        System.out.println("Duplicate character of a given string: ");
        for(int i=0; i<len; i++){
            int count = 1;
            for(int j=i+1; j<len; j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = '0';
                }
            }
            if(count>1 && arr[i] !='0'){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
