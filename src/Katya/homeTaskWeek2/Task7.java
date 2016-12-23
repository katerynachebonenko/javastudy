package Katya.homeTaskWeek2;

import Util.ArrayUtils;

/**
 * Created by katechebonenko on 12/20/16.
 */
public class Task7 {

    //Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
    // который получается в результате суммы arr1[i] + arr2[i]

    public static void main(String[] args) {
        int[] array1 = ArrayUtils.createAndFillRandomArray(3);
        ArrayUtils.printArray(array1);
        System.out.println("-----------");
        int[] array2 = ArrayUtils.createAndFillRandomArray(3);
        ArrayUtils.printArray(array2);
        System.out.println("-----------");
        ArrayUtils.arraySum(array1, array2);


    }
}
