package String;

import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter String?");
        String value = scanner.nextLine();
        //String value="gobi";
        String result="";
        for (int i = value.length()-1; i >=0; i--) {
            char singleChar = value.charAt(i);
            //System.out.print(singleChar);
           result=result+singleChar;
        }
        System.out.println(result);
        if (result.equals(value)) {
            System.out.println("The given String is Palindrome");

        }else {
            System.out.println("thr given String is not palindrome");
        }

    }
}
