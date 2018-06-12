/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.Stas.UserInput;

import java.util.Scanner;

/**
 * 31.05.2018
 * Group pois1709v
 * @author Stas Ilyukovich
 * v 1.0
 */

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static int input(String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }

}
