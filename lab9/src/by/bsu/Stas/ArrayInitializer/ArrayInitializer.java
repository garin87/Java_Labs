/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.Stas.ArrayInitializer;

import java.util.Random;

/**
 * 31.05.2018
 * Group pois1709v
 * @author Stas Ilyukovich
 * v 1.0
 */

public class ArrayInitializer {

  
    
    public static void rndInit(int[][] array, int min, int max, int row, int col) {
        Random random = new Random();
        for (int j = 0; j < row; j++) {
            for (int i = 0; i < col; i++) {
                array[j][i] = random.nextInt(max - min + 1) + min;              
            }  
        }
    }

    public static void userInit(int[][] array, int row, int col) {
        int count = 1;
        for (int j = 0; j < row; j++) {
            for (int i = 0; i < col; i++) {
                array[j][i] = by.bsu.Stas.UserInput.UserInput.input("[" + count +"]: ");
                count++;
            }
        }
    }

}
