package Util;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by katechebonenko on 12/10/16.
 */
public class ArrayUtils {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }

    }

    public static int[] createAndFillArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        return array;

    }

    public static int[] createAndFillRandomArray(int size) {
//        create array
        int[] array = new int[size];
//        fill array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
//        return array
        return array;
    }





  /*  public static int[] randomAndFillArray (int size){
        int [] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array [i] = (int)Math.random()*100;
        }

        return array;

    }*/

    public static int[] createAndFillMinMaxArray(int size, int sizeMin, int sizeMax) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (sizeMin + ((int) Math.random()) * (sizeMax - sizeMin));
        }

        return array;

    }

    public static int findMIn(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }


        }
        return min;


    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            return max;

        }
        return max;

    }





    public static void compareArrays(int[] array1, int[] array2) {


        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];

        }


    }

    public static int[] createAndFillRandomArrayInRange(int size, int min, int max) {
//        create array
        int[] array = new int[size];
//        fill array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
        }
//        return array
        return array;
    }

    public static double findSumCountElements1(int[] array) {

        double countElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countElement++;

            }


        }
        return countElement;

    }


    public static void compareCountElements(int[] array1, int[] array2) {


        if ((findSumCountElements1(array1)) > (findSumCountElements1(array2))) {
            System.out.println("First Array has more counted elements");

        } else {

            System.out.println("Second Array has more counted elements");
        }


    }


    public static void numberInArray(int number, int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                sum++;
            }

        }
        System.out.println("Your number was found in array " + sum);

    }

    public static void Average(int[] array) {

        int sum = 0;
        double average = 0;


        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            average = sum / array.length;

        }

        System.out.println(average);


        //


    }

    public static int[] maxAverage(int[] array) {


        int half = array.length / 2;
        int[] arrayHalf = new int[half];
        int[] arrayHalfPlus = new int[half];

        for (int i = 0; i <= half; i++) {
            //int[] arrayHalf = new int[half];
            arrayHalf[i] = array[i];


            for (int j = 0; j < half; j++) {
                int max2 = 0;
                arrayHalf[j] = array[j + half];


                if (findMax(arrayHalf) > findMax(arrayHalfPlus)) {

                    return arrayHalf;

                } else {

                }
            }

        }
        return arrayHalfPlus;


    }

    public static void arraySum(int[] array1, int[] array2) {


        for (int i = 0; i < array1.length; i++) {

            System.out.println(array1[i] + array2[i]);

        }


    }

    //6) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное

    //1.Половина массива index

    public static int halfArray(int[] array) {

        int half;

        half = array.length / 2;

        return half;


    }


    //2. Среднее арифметическое массива до половины

    public static double averageArray1(int[] array) {

        int half = halfArray(array);
        int sum = 0;
        int sumIndex = half + 1; //отсч]т с 0
        double average = 1;

        for (int i = 0; i <= half; i++) {
            sum = sum + array[i];


        }
        average = (double) sum / sumIndex;


        return average;

    }

    //3. Среднее арифметическое массива после половины

    public static double averageArray2(int[] array) {

        int half = halfArray(array);
        int sum = 0;
        int sumIndex = array.length - half;
        double average;

        for (int i = half + 1; i < array.length; i++) {
            sum = sum + array[i];


        }
        average = (double) sum / sumIndex;


        return average;

    }

    //5. сравнение и вывод

    public static void compareAverage(int[] array) {


        int half = halfArray(array);
        System.out.println("half" + half);
        if ((averageArray1(array)) > (averageArray2(array))) {
            System.out.println("first array half is more" + Arrays.toString(Arrays.copyOfRange(array, 0, half)));
        } else if ((averageArray1(array)) < (averageArray2(array))) {
            System.out.println("second array half is more" + Arrays.toString(Arrays.copyOfRange(array, half, array.length)));

        } else {
            System.out.println("average number is same");
        }
    }

    //               	8) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные


    private static int findMin(int[] array) {

        if(array == null || array.length == 0) {
            return -1;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


    public static void printMinMax(int[] array) {
        if(array == null || array.length == 0) {
            System.err.println("Array is null or length == 0");
            return;
        }
        int max = findMax(array);
        int min = findMin(array);
        System.out.println("min - " + min + " max - " + max);

    }

    public static void swapMinMax(int[] array) {
        if(array == null || array.length == 0) {
            System.err.println("Array is null or length == 0");
            return;
        }
        int minIdx = findMinIndex(array);
        int maxIdx = findMaxIndex(array);
        swap(array, maxIdx, minIdx);
    }

    private static void swap(int[] array, int maxIdx, int minIdx) {
        int temp = array[maxIdx];
        array[maxIdx] = array[minIdx];
        array[minIdx] = temp;
    }

    private static int findMaxIndex(int[] array) {
        int maxIdx = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    private static int findMinIndex(int[] array) {
        int minIdx = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

/*
10) Написать метод, который будет обрезать массив по границам start и end

 public static int[] splitArray(int[] arr, int start, int end) {
 // обрезать массив по границам start и end
 }
 */

    public static int[] splitArray(int[] arr, int start, int end){

       for (int i=0; i<arr.length;i++){

         arr[i]++;
       }

       return arr;





        }



}