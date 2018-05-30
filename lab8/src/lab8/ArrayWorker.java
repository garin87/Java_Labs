/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;



/**
 * 30.05.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class ArrayWorker {

    public static int GetMaxArray(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int GetMinArray(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double ArithmeticMean(int[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
        }

        return sum / array.length;
    }

    public static double GeometricMean(int[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
        }

        return Math.sqrt(sum);
    }

    public static boolean CheckSortArrayUp(int[] array) {

        Boolean flag = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                flag = true;
            } else {
                return flag;
            }
        }
        return flag;
    }

    public static boolean CheckSortArrayDown(int[] array) {

        Boolean flag = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i + 1]) {
                flag = true;
            } else {
                return flag;
            }
        }
        return flag;
    }

    // public static void sortArray(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //        for (int j = 0; j < array.length - i - 1; j++) {
    //            if (array[j] > array[j + 1]) {
    //                int temp = array[j];
    //                 array[j] = array[j + 1];
    //               array[j + 1] = temp;
    //            }
    //      }
    //    }
    // }
    public static int getLocalMax(int[] array) {

        int localMax = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                localMax = i;
                break;
            }
        }
        return localMax;
    }
    
    public static int getLocalMin(int[] array) {

        int localMin = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                localMin = i;
                break;
            }
        }
        
        return localMin;
    }
    
    public static void ReverseArray(int[] array) {

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }

}
