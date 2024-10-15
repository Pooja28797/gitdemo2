import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagramstring {
    public static void main(String[] args) {
        String a="race";
        String b="rare";
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()==b.length()) {
            char c[] = a.toCharArray();
            char d[] = b.toCharArray();

            Arrays.sort(c);
            Arrays.sort(d);

            if (Arrays.equals(c, d))
            {
                System.out.println("String is anagram");
            }
            else {
                System.out.println("String is not anagram");
            }
        }
    }
}
