/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessNumber;

/**
 * 28.05.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */

public class Logic {

    public static int find(int number, int a, int b) {

        int left, right, mid = 0;

        left = b;
        right = a;

        while (left <= right) {

            if (number < left || number > right) {

                System.out.println("Not found!");
                break;
            }

            mid = (left + right) / 2;

            if (mid == number) {
                System.out.println(mid);
                break;
            }

            if (number < mid) {

                right = mid - 1;
                System.out.println(mid);
            } else {
                left = mid + 1;
                System.out.println(mid);
            }

        }
        return mid;
    }

}
