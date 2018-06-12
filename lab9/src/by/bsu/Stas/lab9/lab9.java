/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.Stas.lab9;

import by.bsu.Stas.logic.logicTaskA;
import java.util.Arrays;

/**
 * 31.05.2018
 * Group pois1709v
 * @author Stas Ilyukovich
 * v 1.0
 */

public class lab9 {
    
    public static void main(String[] args){
       
        int row = by.bsu.Stas.UserInput.UserInput.input("Enter count row of array: ");
        int col = by.bsu.Stas.UserInput.UserInput.input("Enter count col of array: ");

        int[][] array = by.bsu.Stas.ArrayCreator.ArrayCreator.createaArray(row,col);

        by.bsu.Stas.ArrayInitializer.ArrayInitializer.rndInit(array, 0, 9, row, col);
        //by.bsu.Stas.ArrayInitializer.ArrayInitializer.userInit(array);
        by.bsu.Stas.View.View.print("Array: \n" + Arrays.deepToString(array).replace("], ", "]\n"));
        
        by.bsu.Stas.View.View.print("\n");
        
       logicTaskA.task1(array,row, col);
       by.bsu.Stas.View.View.print("\n");
       int MaxString =  logicTaskA.task2(array, row, col);
       by.bsu.Stas.View.View.print("MaxString: " + MaxString);
       by.bsu.Stas.View.View.print("\n");
       int MinString = logicTaskA.task3(array, row, col);
       by.bsu.Stas.View.View.print("MinString: " + MinString);
       by.bsu.Stas.View.View.print("\n");
       logicTaskA.task4(array, row, col);
       by.bsu.Stas.View.View.print("\n");
       int MaxCol = logicTaskA.task5(array, row, col);
       by.bsu.Stas.View.View.print("MaxCol: " + MaxCol);
       by.bsu.Stas.View.View.print("\n");
       int maxIsRepeat = logicTaskA.task8(array, row, col);
       by.bsu.Stas.View.View.print("maxOfRepeat: " + maxIsRepeat);
       by.bsu.Stas.View.View.print("\n");
       int maxDiagonal = logicTaskA.task10(array, row, col);
       by.bsu.Stas.View.View.print("Maximum diagonal: " + maxDiagonal);
       by.bsu.Stas.View.View.print("\n");
       logicTaskA.task11(array, row, col);
    }

}
