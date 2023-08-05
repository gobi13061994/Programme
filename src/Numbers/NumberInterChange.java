package Numbers;

import java.util.Comparator;
import java.util.regex.Pattern;

public class NumberInterChange {
    public static void main(String[] args) {
             //012345;
        int a =956573;
        String rev = String.valueOf(a);
        String substring = rev.substring(0, 2);
        System.out.println(substring);
        String substring1 = rev.substring(4);
        System.out.println(substring1);
        String substring2 = rev.substring(2, 4);
        System.out.println(substring2);
        String concat = substring2.concat(substring).concat(substring1);
        System.out.println(concat);

    }
}
