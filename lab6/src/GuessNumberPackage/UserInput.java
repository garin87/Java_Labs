/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessNumberPackage;

import java.util.Scanner;

/**
 * 29.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class UserInput {

    public static int InputA() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper range: ");

        int a = scanner.nextInt();

        return a;
    }

    public static int InputB() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower range: ");

        int b = scanner.nextInt();

        return b;
    }
    
    public static int InputRest() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 to start a new game or 0 to exit: ");

        int rest = scanner.nextInt();

        return rest;
    }

    public static int InputNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");

        int n = scanner.nextInt();

        return n;
    }
}
