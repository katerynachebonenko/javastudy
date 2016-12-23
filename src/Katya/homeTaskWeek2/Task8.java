package Katya.homeTaskWeek2;

import Util.ArrayUtils;

/**
 * Created by katechebonenko on 12/20/16.
 */
public class Task8 {
    //               	8) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные

    public static void main(String[] args) {
        int[] array1 = ArrayUtils.createAndFillRandomArray(4);
        System.out.println("Array values");
        ArrayUtils.printArray(array1);
        System.out.println("---------");
        ArrayUtils.swapMinMax(array1);
        ArrayUtils.printArray(array1);


    }


}
