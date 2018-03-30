/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationsOnNumberspackage;

import java.util.List;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class view {
    
    public static void print(int sum, int amount, int different, int max, 
            boolean palindrome, boolean  prime,  List<Integer> divide, int GCD, int LCM){
       
        System.out.println("Сумма цифр введенного числа: " + sum );
        System.out.println("Количестово цифр введенного числа: " + amount);
        System.out.println("Различные цифры введенного числа: " + different);
        System.out.println("Наибольшая цифра введенного числа: " + max);
        System.out.println("Введенное число палиндром: " + palindrome);
        System.out.println("Введенное число простое: " + prime);
        System.out.println("Простые делители введенного числа: " + divide);
        System.out.println("НОД введенных чисел: " + GCD);
        System.out.println("НОК введенных чисел: " + LCM);
    }
}
