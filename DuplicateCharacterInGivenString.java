package StringPracticeProblem;
import java.util.*;
public class DuplicateCharacterInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.println("Enter string");
        s = sc.nextLine();

        int len = s.length();

        char [] arr = new char[len];
        arr = s.toCharArray();

        System.out.println("Duplicate character in a given String are: ");
        for(int i=0; i<len; i++){
            int count=1;
            for(int j=i+1; j<len; j++){
                if(arr[i] == arr[j] && arr[i] !=' '){
                    count++;
                    arr[j]='0';
                }
            }
            if(count >1 && arr[i] != '0'){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
