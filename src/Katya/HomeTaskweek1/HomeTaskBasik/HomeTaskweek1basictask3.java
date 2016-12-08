package Katya.HomeTaskweek1.HomeTaskBasik;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/8/16.
 */
public class HomeTaskweek1basictask3 {
    public static void main(String[] args) {
//task 2.3 Пользователь вводит число. Вывести на экран его удвоенное значение,если число делится на 7 нацело.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        double number = scanner.nextInt();

        if ( number%7 == 0){

            double newNumber = number*number;
            System.out.println (newNumber);

        }
    }
}
