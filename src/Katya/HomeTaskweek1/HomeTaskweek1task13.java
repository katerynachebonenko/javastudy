package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/7/16.
 */
public class HomeTaskweek1task13 {
    public static void main(String[] args) {
        //task13 Даны три числа A,B,C. Увеличить числа в два
        // раза, если A+B+C>0, в противном случае заменить
        //на нули.

        Scanner scanner = new Scanner(System.in);

        System.out.println("A");
        int a = scanner.nextInt();
        System.out.println("B");
        int b = scanner.nextInt();
        System.out.println("C");
        int c = scanner.nextInt();

        if (a + b + c > 0) {
            int newA = a * a;
            int newB = b * b;
            int newC = c * c;
            System.out.println("Numbers are increased in twice: new A " + newA + " New B " + newB + " New C " + newC);
        } else {
            a = 0;
            b = 0;
            c = 0;
            System.out.println("A " + a + " B " + b + " C " + c);
        }

    }
}
