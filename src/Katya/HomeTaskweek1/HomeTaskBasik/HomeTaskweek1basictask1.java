package Katya.HomeTaskweek1.HomeTaskBasik;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/8/16.
 */
public class HomeTaskweek1basictask1 {
    public static void main(String[] args) {
        //basic 2.1 Пользователь вводит параметр с консоли (текущий час от 0 до 24)
        //Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рабочие часы");
        int workHours = scanner.nextInt();

        if (workHours >= 0 && workHours <= 24) {
            if (workHours >= 9 && workHours <= 18) {
                System.out.println("Я на работе");
            } else {
                System.out.println("Я отдыхаю");
            }


        } else {
            System.out.println("Введите рабочие час от 0 до 24");
        }

    }
}
