package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/6/16.
 */
public class HomeTaskweek1task10 {
    public static void main(String[] args) {
        //task10 Написать программу вычисления стоимости переговоров, если по суббо-
        //там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
        //      ность разговора и день недели (цифра от 1 до 7).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day of week");
        int day = scanner.nextInt();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        System.out.println("Enter call duration");
        int duration = scanner.nextInt();

        double newPrice = price * 0.8;
        double costCall = price * duration;
        double newCost = newPrice * duration;

        if (day >= 1 && day <= 5) {
            System.out.println("Price without discount " + costCall);
        } else if (day > 5 && day < 7) {
            System.out.println("Price with discount" + newCost);
        } else {
            System.out.println("You entered incorrect day of week!");

        }
    }


}

