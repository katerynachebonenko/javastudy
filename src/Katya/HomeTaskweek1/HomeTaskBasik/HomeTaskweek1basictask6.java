package Katya.HomeTaskweek1.HomeTaskBasik;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/8/16.
 */
public class HomeTaskweek1basictask6 {
    public static void main(String[] args) {
        //2.6 Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scanner.nextInt();
        System.out.println("Enter second number");
        int second = scanner.nextInt();
        int sum = first + second;

        if (sum >= 11 && sum <= 19) {
            System.out.println(sum);
        }


    }
}
