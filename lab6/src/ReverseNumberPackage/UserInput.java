/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseNumberPackage;

import java.util.Scanner;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class UserInput {
    
    public static int UserN(){
      

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int n = scanner.nextInt();
        
        return n;
    }
}
