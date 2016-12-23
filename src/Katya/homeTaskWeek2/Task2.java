package Katya.homeTaskWeek2;


import Util.ArrayUtils;

/**
 * Created by katechebonenko on 12/18/16.
 */
public class Task2 {

    //	2) Найти среднее арифметическое массива

    public static void main(String[] args) {

        int[] Array1 = ArrayUtils.createAndFillRandomArray(4);
        ArrayUtils.printArray(Array1);
        System.out.println("-----------");
        ArrayUtils.Average(Array1);


    }
}
