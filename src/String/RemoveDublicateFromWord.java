package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicateFromWord {
    public static void main(String[] args) {
        String s="Welcome to Indian Army , Army is Welcome";
        String[] splitString = s.split(" ");
        Set<String> set=new LinkedHashSet();
        for (int i=0;i<=splitString.length-1;i++){
            set.add(splitString[i]);
        }
        for (String ori:set) {
            System.out.print(ori);

        }
    }

}
