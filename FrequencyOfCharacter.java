package StringPracticeProblem;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.println("Enter string");
        s = sc.nextLine();

        s = s.toLowerCase();
        char [] string = s.toCharArray();

        System.out.println("Character\tFrequency");
        for(char ch='a'; ch<='z'; ch++){
            int count = 0;
            for(int i=0; i<string.length; i++){
                if(ch == string[i]){
                    count++;
                }
            }
            if(count != 0){
                System.out.println(ch +"\t\t"+ count);
            }
        }
        sc.close();
    }
}
