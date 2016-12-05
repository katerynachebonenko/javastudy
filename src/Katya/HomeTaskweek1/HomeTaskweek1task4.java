package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/5/16.
 */
public class HomeTaskweek1task4 {
    public static void main(String[] args) {
        //fourthtask Известны две скорости, одна в километрах в час, другая в метрах в секун-
        //ду. Какая из них больше?
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first speed - km/h");
        int speed = scanner.nextInt();
        System.out.println("enter number  - m/sec");
        int speed2 = scanner.nextInt();

//60 км в час= 60*1000/3600

        double msec=speed*1000/3600;

        System.out.println("m/sec "+ msec);

        if (speed2>msec)

        {
            System.out.println("Speed m/sec is more then km/h");
        }
        else
        {
            System.out.println("Speed km/h is more then m/sec");
        }


    }
}
