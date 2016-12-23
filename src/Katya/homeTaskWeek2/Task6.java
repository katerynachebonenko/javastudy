package Katya.homeTaskWeek2;

import Util.ArrayUtils;

/**
 * Created by katechebonenko on 12/20/16.
 */
public class Task6 {
    //	6) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
    public static void main(String[] args) {
        int[] array1 = ArrayUtils.createAndFillRandomArray(6);
        ArrayUtils.printArray(array1);
        System.out.println("-----------");
        ArrayUtils.compareAverage(array1);


    }
}
