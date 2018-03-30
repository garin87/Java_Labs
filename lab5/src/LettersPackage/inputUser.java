/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LettersPackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
import java.util.Scanner;

public class inputUser {
    
    public static char input() {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the letter: ");
        
        char ch = scanner.next().charAt(0);
        
        return ch;

    }
}
