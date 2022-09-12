package StringPracticeProblem;

import java.util.Scanner;

public class DuplicateWordsInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.println("Enter String: ");
        s = sc.nextLine();

        // s = s.toLowerCase();

        String [] arr = s.split(" ");

        System.out.println("Duplicate words in a given string: ");

        for(int i=0; i<arr.length; i++){
            int count =1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].equalsIgnoreCase(arr[j])){
                    count++;
                    arr[j] = "0";
                }
            }
            if(count >1 && arr[i] !="0"){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
