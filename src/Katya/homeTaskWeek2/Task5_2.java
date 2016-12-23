package Katya.homeTaskWeek2;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/21/16.
 */
public class Task5_2 {

    //5.2. Вычислить факториал числа.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        int factorial = a;

        while (a != 1) {

            a--;
            factorial = factorial * a;

        }

        System.out.println(factorial);

    }
}
