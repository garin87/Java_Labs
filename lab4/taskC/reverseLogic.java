/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversePackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class reverseLogic {

    public static int reverse(int a) {

        int reverseNumber = 0;

        while (a != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + a % 10;
            a = a / 10;
        }

        return reverseNumber;

    }
}
