package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/5/16.
 */
public class HomeTaskweek1task3 {

    public static void main(String[] args) {

        //third task Дано трехзначное число. Определить: а) верно ли, что все его цифры
        //одинаковые; б) есть ли среди его цифр одинаковые.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number (3 digits): ");
        int number = scanner.nextInt();

        int first = (number / 100)%10;// 1
        int second = (number / 10) % 10;// 2
        int third = (number % 10);

        if (first == second && second == third && third==first) {
            System.out.println("All digits are same!");
        }

        else if (first ==second ) {
            System.out.println("First and second digits match!");
        }
         else    if (second == third) {
            System.out.println("Second and third digits match!");
        }
        else if (third == first) {
            System.out.println("Third and first digits match!");
                 }
                 else
        {
            System.out.println("All digits don't match");
        }

        }
    }

