package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/6/16.
 */
public class HomeTaskweek1task9 {

    public static void main(String[] args) {
        //task9 Написать программу вычисления идеального веса пользователя (рост-
        //100). Выдать рекомендации о необходимости поправиться либо похудеть.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Height");
        int height = scanner.nextInt();
        System.out.println("Weight");
        int weight = scanner.nextInt();

        int ideal_weight=height-100;
        System.out.println("Your ideal weight is " + ideal_weight + "kg");

        if (weight>ideal_weight)
        {
            int diff = ideal_weight-weight;
            System.out.println("You should loose "+ Math.abs(diff) + "kg");
        }
        else if(weight<ideal_weight)

        {
            System.out.println("You weight is less then ideal");
        }
        else
        {
            System.out.println("You weight is ideal");
        }


    }
}
