package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/7/16.
 */
public class HomeTaskweek1task12 {
    public static void main(String[] args) {

        //task12 Написать программу, которая в зависимости от скорости ветра выдает
        //сообщение о его характере от 1до 4 м/с - слабый (1); от 5-10 м/c -
        //      умеренный (2); от 11-18 м/c - сильный (3); больше 19 м/c - ураганный (4).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int windSpeed = scanner.nextInt();

        if (windSpeed >= 1 && windSpeed <= 4) {
            System.out.println("слабый");
        } else if (windSpeed >= 5 && windSpeed <= 10) {
            System.out.println("умеренный");
        } else if (windSpeed >= 11 && windSpeed <= 18) {
            System.out.println("сильный");
        } else if (windSpeed >= 19) {
            System.out.println("ураганный");
        }


    }
}
