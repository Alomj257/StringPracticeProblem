package StringPracticeProblem;

public class TotalNumberOfVowelsAndConsonants {
    public static void main(String[] args) {
        String s = new String();
        s = "This is a really simple sentence";
        s = s.replaceAll("\\s", "");
        System.out.println(s);

        int l = s.length();
        int vCount = 0, cCount = 0;
        s = s.toLowerCase();
        char [] a = s.toCharArray();

        for(int i=0; i<l; i++){
            if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] =='u'){
                vCount++;
            }
            else if( a[i] >= 'a' && a[i] <= 'z'){
                cCount++;
            }
        }

        System.out.println("Number of vowles: " +vCount);
        System.out.println("Number of consonants: " +cCount);
    }
}
