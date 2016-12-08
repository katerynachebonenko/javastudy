package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/7/16.
 */
public class HomeTaskweek1task11 {
    public static void main(String[] args) {

        //task 11 Написать программу, которая при вводе числа в диапазоне от 1 до 99
        //добавляет к нему слово "копейка" в правильной форме. Например, 1
        //копейка, 5 копеек, 42 копейки .

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();
        int first = (number % 10);

        if ((first >= 5 || first == 0) || (number > 10 && number < 15)) {
            System.out.println(number + "копеек");

        } else if (first == 1) {
            System.out.println(number + "копейка");
        } else {
            System.out.println(number + "копейки");

        }


    }
}

