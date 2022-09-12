package StringPracticeProblem;

import java.util.Scanner;

public class ReplaceSpaceWithSpecifiedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = new String();
        System.out.println("Enter the string: ");
        s = sc.nextLine();

        // s = s.replaceAll("\\s", "\\-");
        // System.out.println("After replacing: " +s);

        s = s.replace(' ', '-');
        System.out.println(s);
        sc.close();
    }
}
