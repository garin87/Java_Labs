/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Arrays;

/**
 * 30.05.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class Lab8 {

    public static void main(String[] args) {

        int size = UserInput.input("Enter size of array: ");
        int[] array = ArrayCreator.createaArray(size);

        ArrayInitializer.rndInit(array, 1, 10);
        View.print("Array: " + Arrays.toString(array));

        int max = ArrayWorker.GetMaxArray(array);
        int min = ArrayWorker.GetMinArray(array);
        double avr = ArrayWorker.ArithmeticMean(array);
        double SquareRoot = ArrayWorker.GeometricMean(array);
        // ArrayWorker.sortArray(array);
        // View.print("\nArray sorted: " + Arrays.toString(array));
        boolean CheckSortUp = ArrayWorker.CheckSortArrayUp(array);
        boolean CheckSortDown = ArrayWorker.CheckSortArrayDown(array);
        
        int LocalMax = ArrayWorker.getLocalMax(array);
        int LocalMin = ArrayWorker.getLocalMin(array);
        ArrayWorker.ReverseArray(array);
        View.print("\nArray reverse: " + Arrays.toString(array));
        
        View.print("\nMax of the array: " + max);
        View.print("\nMin of the array: " + min);
        View.print("\nArithmeticMean of the array: " + avr);
        View.print("\nGeometricMean of the array: " + SquareRoot);
        View.print("\nArray sorted in ascending order: " + CheckSortUp);
        View.print("\nArray sorted in descending order: " + CheckSortDown);
        View.print("\nFirst local max of the array: " + LocalMax);
        View.print("\nFirst local min of the array: " + LocalMin);
    }

}
