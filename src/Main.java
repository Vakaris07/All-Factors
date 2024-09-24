//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void printFactors(int number) {


        for (int i = 1; i <= number; i++)
            if (number < 1) {
                System.out.println("Invalid Value");
            } else {
                if (number % i == 0) System.out.println(i);
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        printFactors(number);


    }
}
