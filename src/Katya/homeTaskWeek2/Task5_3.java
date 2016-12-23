package Katya.homeTaskWeek2;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/21/16.
 * <p>
 * <p>
 * 5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
 * 5678  -   1
 * 5889  -   2
 * 8888  -   4
 * 989990  - 1
 */
public class Task5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        int count = 0;

        while (a > 7) {

            if (a % 10 == 8) {

                count++;

            }
            a /= 10;


        }
        System.out.println(count);
    }
}
