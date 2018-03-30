/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerfectNumberPackage;
/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LogicPerfectNumber {

    public static boolean PerfectNumber(int number) {

        int sum = 0;
        boolean result = false;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (number == sum) {

            result = true;
        }
        
        return result;
    }
}
