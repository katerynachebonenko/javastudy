package Katya.HomeTaskweek1.HomeTaskBasik;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/8/16.
 */
public class HomeTaskweek1basictask5 {
    public static void main(String[] args) {
        //2.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
        //  Если второе больше, то выводим сумму.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scanner.nextInt();
        System.out.println("Enter second number");
        int second = scanner.nextInt();

        if (first > second) {

            int diff = first - second;
            System.out.println(diff);

        } else {
            int sum = first + second;
            System.out.println(sum);
        }
    }
}
