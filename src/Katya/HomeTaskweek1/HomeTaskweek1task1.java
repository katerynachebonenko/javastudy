package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/5/16.
 */
public class HomeTaskweek1task1 {

    public static void main(String[] args) {


        //first task (additional) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
        //лить, является ли он прямоугольным. Ответ вывести в виде сообщения.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println("enter c");
        int c = scanner.nextInt();

        if (a<b&&c<b) {
            int cathetus1 = (int) Math.pow(a, 2);
            int cathetus2 = (int) Math.pow(c, 2);
            int hypotenuse = (int) Math.pow(b, 2);
            if (cathetus1 + cathetus2 == hypotenuse)

                System.out.println("Right triangle with cathetus=a, cathetus=c, hypotenuse=b");
            else
                System.out.println("Triangle isn't right!");
        }
        else if (b<a&&c<a) {
                 int cathetus1 = (int) Math.pow(b, 2);
                 int cathetus2 = (int) Math.pow(c, 2);
                 int hypotenuse = (int) Math.pow(a, 2);
                 if (cathetus1 + cathetus2 == hypotenuse)

                     System.out.println("Right triangle with cathetus=b, cathetus=c, hypotenuse=a");
                 else
                 System.out.println("Triangle isn't right!");

             }
        else if (a<c&&b<c)
                 {
                     int cathetus1 = (int)Math.pow(a, 2);
                     int cathetus2 = (int)Math.pow(b, 2);
                     int hypotenuse = (int)Math.pow(c, 2);
                     if (cathetus1 + cathetus2 == hypotenuse)

                         System.out.println("Right triangle with cathetus=a, cathetus=b, hypotenuse=c");

                  else

            System.out.println("Triangle isn't right!");
        }





    }
}
