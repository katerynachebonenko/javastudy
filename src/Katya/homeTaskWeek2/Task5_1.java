package Katya.homeTaskWeek2;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by katechebonenko on 12/21/16.
 */
public class Task5_1 {

    // 5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();

        int b = 0;
        String result = "";

        while (a != 0) {

            result = a % 2 + result;
            a = a / 2;

        }

        System.out.println(result);


    }
}

