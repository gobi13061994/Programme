package String;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String?");
        String value = scanner.nextLine();
        String[] each = value.split(" ");
        String exchangeLocation = "";
        for (int i = each.length - 1; i >= 0; i--) {
            String singleWord = each[i];
            exchangeLocation = exchangeLocation + singleWord + " ";

        }
        System.out.println(exchangeLocation);

    }
}
