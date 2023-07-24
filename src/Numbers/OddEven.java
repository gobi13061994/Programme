package Numbers;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enten name?");
        int number = scanner.nextInt();
    if (number%2==1){
        System.out.println("The given Number is ODD Number");
    }else {
        System.out.println("The given number is Even Number");
    }

    }
}
