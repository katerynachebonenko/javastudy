package Katya.homeTaskWeek2;

import Util.ArrayUtils;

/**
 * Created by katechebonenko on 12/20/16.
 */
public class Task4 {
    //4) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй

    public static void main(String[] args) {
        int[] array1 = ArrayUtils.createAndFillRandomArray(4);
        ArrayUtils.printArray(array1);
        System.out.println("-----------");
        int[] array2 = ArrayUtils.createAndFillRandomArray(4);
        ArrayUtils.printArray(array2);
        System.out.println("-----------");
        ArrayUtils.compareArrays(array1, array2);
        ArrayUtils.printArray(array2);

    }
}
