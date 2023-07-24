package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        String s="gobi  goooobi";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i <s.length(); i++) {
            char charAt = s.charAt(i);
            if (map.containsKey(charAt)){
                Integer count = map.get(charAt);
                map.put(charAt,count+1);
            }else {
                map.put(charAt,1);
            }

        }
        System.out.println(map);
    }
}
