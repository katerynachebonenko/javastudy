package Katya.HomeTaskweek1.HomeTaskBasik;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/8/16.
 */
public class Hometaskweek1basictask7 {
    public static void main(String[] args) {
        //Вводим два числа, если одно из них делиться на другое без остатка,
        // то выводим true и показываем результат деления (целую часть от деления  и остачу)
        //в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scanner.nextInt();
        System.out.println("Enter second number");
        int second = scanner.nextInt();
        double division = first % second;

        if (division == 0) {
            System.out.println("True" + first / second);
        } else {
            System.out.println("False" + division);
        }
    }
}
