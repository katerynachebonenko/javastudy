package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/5/16.
 */
public class HomeTaskweek1task5 {
    public static void main(String[] args) {
        //taskfive Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
        //пара равных

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println("enter c");
        int c = scanner.nextInt();

        if (a == b)
        {
            System.out.println("a=b");
        }
        else if (a==c)
        {
            System.out.println("a=c");
        }
        else if (b==c)
        {
            System.out.println("b=c");
        }
        else
            System.out.println("All numbers don't match!");

    }
}
