/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationsOnNumberspackage;

import java.util.List;
import java.util.ArrayList;
/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LogicOperationsOnNumbers {

    public static int sumNumber(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static int amountNumber(int n) {
        int amount = 0;

        while (n != 0) {
            n = n / 10;
            amount++;
        }

        return amount;
    }

    public static int differentNumber(int n) {
        int different = 1;
        int[] a = new int[10];
        int count = 0;

        while (n != 0) {

            a[count] = n % 10;
            count++;
            n = n / 10;
        }

        for (int i = 1; i < count; i++) {
            for (int k = i + 1; k <= count; k++) {
                if (a[k] != a[i]) {
                    different++;
                    break;
                }
            }
        }
         
        return different;
    }

    public static int maxNumber(int n) {
        int max = 0;

        while (n != 0) {
            if (n % 10 > max) {
                max = n % 10;
            }
            n = n / 10;
        }

        return max;
    }

    public static boolean palindromeNumber(int n) {

        boolean palindrome = false;
        int[] a = new int[10];
        int count = 0;

        while (n != 0) {

            a[count] = n % 10;
            count++;
            n = n / 10;
        }

        for (int i = 0; i < count / 2; i++) {
            if (a[i] == a[count - 1 - i]) {
                palindrome = true;
                break;
            }
        }

        return palindrome;
    }

    public static boolean primeNumber(int n) {
        boolean prime = false;

        int sum = 0;
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum <= 1) {
            prime = true;
        }

        return prime;
    }

    public static List<Integer> primeDivideNumber(int n) {

        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }

        return factors;
    }

    public static int GCDNumber(int n, int x) {
        
        while (n != x) {
            if (n > x) {
                n -= x;
            } else {
                x -= n;
            }
        }
      
        return x;
    }
    
    public static int LCMNumber(int n, int x) {
        int k = n;
        int y = x;
        
        while (n != x) {
            if (n > x) {
                n -= x;
            } else {
                x -= n;
            }
        }
         
        
        return (k * y)/n;
    }
}
