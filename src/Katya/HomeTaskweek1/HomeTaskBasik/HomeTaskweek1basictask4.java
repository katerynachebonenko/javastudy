package Katya.HomeTaskweek1.HomeTaskBasik;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/8/16.
 */
public class HomeTaskweek1basictask4 {
    public static void main(String[] args) {
        // task2.4 Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        double number = scanner.nextDouble();

        if (number >= 0 && number <= 1) {
            System.out.println("Your number is in range from 0 to 1");
        }

    }
}
