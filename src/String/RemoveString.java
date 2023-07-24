package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveString {
    public static void main(String[] args) {
        String s = "Raining here.....   ";
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i <= s.length() - 1; i++) {
            set.add(s.charAt(i));

        }
        for (Character c : set) {
            System.out.print(c);
        }
    }
}
