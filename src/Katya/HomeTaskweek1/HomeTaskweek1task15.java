package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/7/16.
 */
public class HomeTaskweek1task15 {
    public static void main(String[] args) {
        //task15 finally! Известны площади круга и квадрата. Определить: а) уместится ли круг в
        //квадрат; б) уместится ли квадрат в круге.

        Scanner scanner = new Scanner(System.in);

        System.out.println("S Circle ");
        int circleS = scanner.nextInt();
        System.out.println("S Square");
        int squareS = scanner.nextInt();

        if (circleS < squareS) {
            System.out.println("Круг уместится в квадрате");
        } else {
            System.out.println("Квадрат уместится в круге");
        }

    }
}
