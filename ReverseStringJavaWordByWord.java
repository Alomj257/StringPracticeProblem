package StringPracticeProblem;

import java.util.Scanner;

public class ReverseStringJavaWordByWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.println("Enter string: ");
        s = sc.nextLine();

        System.out.println("Original string word by word: ");
        String [] arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println("Reverse String word by word: ");
        for(int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}
