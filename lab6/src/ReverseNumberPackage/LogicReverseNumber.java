/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseNumberPackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LogicReverseNumber {
  
    
    public static int reverse(int n) {

        int reverseNumber = 0;

        while (n != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + n % 10;
            n = n / 10;
        }

        return reverseNumber;

    }
}
