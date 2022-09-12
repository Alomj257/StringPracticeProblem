package StringPracticeProblem;

public class LowerCaseToUpperCaseAndViceVersa {
    public static void main(String[] args) {
        String s1 = new String("JAHANGIR ALOM");

        System.out.println("Upper case to lower case: ");
        System.out.println(s1.toLowerCase());
        s1 = s1.toLowerCase();
        System.out.println(s1);


        String s2 = new String("mina begum");

        System.out.println("Lower case to upper case: ");
        System.out.println(s2.toUpperCase());
        s2 = s2.toUpperCase();
        System.out.println(s2);
    }
}
