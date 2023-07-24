package String;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String?");
        String value = scanner.nextLine();
        String[] each = value.split(" ");
        String result = "";
        for (int i = 0; i < each.length; i++) {
            String singleWord = each[i];
            String reverse = "";
            for (int j = singleWord.length() - 1; j >= 0; j--) {
                char chw = singleWord.charAt(j);
                reverse = reverse + chw;


            }
            result = result + reverse + " ";
        }

        System.out.println(result);

    }
}
