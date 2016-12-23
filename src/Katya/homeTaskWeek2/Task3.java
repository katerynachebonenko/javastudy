package Katya.homeTaskWeek2;

import Util.ArrayUtils;

/**
 * Created by katechebonenko on 12/20/16.
 */
public class Task3 {
    //Поменять местами наибольший
    //  и наименьший элементы в массиве

    public static void main(String[] args) {

        int[] array = ArrayUtils.createAndFillRandomArray(15);
        ArrayUtils.printArray(array);
        ArrayUtils.swapMinMax(array);
        ArrayUtils.printArray(array);
    }

}
