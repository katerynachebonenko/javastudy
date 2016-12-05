package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/5/16.
 */
public class HomeTaskweek1task2 {

    public static void main(String[] args) {

        //second task 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
        //тельные заменить на 0.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = scanner.nextInt();
        System.out.println("enter number 2");
        int num2 = scanner.nextInt();
        System.out.println("enter number 3");
        int num3 = scanner.nextInt();

        if (num1>0 && num2>0 && num3>0) {
            int pos1 = (int) Math.pow(num1, 3);
            int pos2 = (int) Math.pow(num2, 3);
            int pos3 = (int) Math.pow(num3, 3);

            System.out.println("Positive number1 " + pos1 + " Positive number2 " + pos2 + " Positive number3 " + pos3);
        }
            else if (num1<0 && num2>0 && num3>0)
        {
            int pos1 = 0;
            int pos2 = (int)Math.pow(num2, 3);
            int pos3 = (int)Math.pow(num3, 3);

            System.out.println("Negative number1 "+pos1+" Positive number2 "+pos2+" Positive number3 "+pos3);
        }
        else if (num1<0 && num2<0 && num3>0)
        {
            int pos1 = 0;
            int pos2 = 0;
            int pos3 = (int)Math.pow(num3, 3);

            System.out.println("Negative number1 "+pos1+"Negative number2 "+pos2+" Positive number3 "+pos3);
        }

        else if (num1<0 && num2<0 && num3<0)
        {
            int pos1 = 0;
            int pos2 = 0;
            int pos3 = 0;

            System.out.println("Negative number1 "+pos1+"Negative number2 "+pos2+" Negative number3 "+pos3);
        }
        else if (num1>0 && num2<0 && num3>0)
        {
            int pos1 = (int)Math.pow(num1, 3);
            int pos2 = 0;
            int pos3 = (int)Math.pow(num3, 3);

            System.out.println("Positive number1 "+pos1+" Negative number2 "+pos2+" Positive number3 "+pos3);
        }
        else if (num1>0 && num2<0 && num3<0)
        {
            int pos1 = (int)Math.pow(num1, 3);
            int pos2 = 0;
            int pos3 = 0;

            System.out.println("Positive number1 "+pos1+" Negative number2 "+pos2+" Negative number3 "+pos3);
        }

        else if (num1>0 && num2>0 && num3<0)
        {
            int pos1 = (int)Math.pow(num1, 3);
            int pos2 = (int)Math.pow(num2, 3);
            int pos3 = 0;

            System.out.println("Positive number1 "+pos1+" Positive number2 "+pos2+" Negative number3 "+pos3);
        }






    }
}
