package Katya.homeTaskWeek2;

import Util.ArrayUtils;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/20/16.
 */
public class Task5 {
    //) Посчитать сколько раз цифра(цифра задается пользователем) встречается в  случайно сгенерированом массиве
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array1 = ArrayUtils.createAndFillRandomArray(5);
        System.out.println("first array");
        ArrayUtils.printArray(array1);

        System.out.println("enter number");
        int number = scanner.nextInt();
        ArrayUtils.numberInArray(number, array1);

    }
}
