package String;

import java.util.*;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "below";
        String s2 = "woelb";
        if (s1.length() == s2.length()) {
            System.out.println("Length is Equal");
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            String s3 = String.valueOf(c1);
            String s4 = String.valueOf(c2);
            if (s3.equals(s4)) {
                System.out.println("Given String is Anagram");
            } else {
                System.out.println("Given String is Not Anagram");
            }


        }
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        Collections.emptySortedMap();

        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length() - 1; i++) {
                char ch1 = s1.charAt(i);

                if (map.containsKey(ch1)) {
                    Integer count = map.get(ch1);
                    map.put(ch1, count + 1);
                } else {
                    map.put(ch1, 1);
                }
            }
            for (int j = 0; j < s2.length() - 1; j++) {
                char ch2 = s2.charAt(j);
                if (map1.containsKey(ch2)) {
                    Integer count = map.get(ch2);

                    map1.put(ch2,count + 1);
                } else {
                    map1.put(ch2, 1);
                }
            }

            System.out.println(map);
            System.out.println(map1);
            map.equals(map1);
            if (map.size()==map1.size()){
                System.out.println("Given String Is anagram");
            }else {
                System.out.println("Given String is not Anagram");
            }


        }

    }
}
