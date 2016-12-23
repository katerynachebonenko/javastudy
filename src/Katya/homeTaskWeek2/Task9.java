package Katya.homeTaskWeek2;

import Util.ArrayUtils;

/**
 * Created by katechebonenko on 12/22/16.
 */
public class Task9 {
    //	9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.

    public static void main(String[] args) {
        int[] array1 = ArrayUtils.createAndFillRandomArrayInRange(6, 25, 75);
        ArrayUtils.printArray(array1);
        System.out.println("---------");
        int[] array2 = ArrayUtils.createAndFillRandomArrayInRange(6, 25, 75);
        ArrayUtils.printArray(array2);
        System.out.println("---------");


        ArrayUtils.compareCountElements(array1, array2);

    }
}
