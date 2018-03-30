/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationsOnNumberspackage;

import java.util.Scanner;


/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class UserInput {

    public static int inputNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int number = scanner.nextInt();
        
        return number;
    }
    
    public static int inputGCDNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int x = scanner.nextInt();

        return x;
    }
}
