/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
import java.util.Scanner;

public class UserInput {

    public static int InputYear() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год:");

        return scanner.nextInt();
    }

    public static int InputMonth() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц:");

        return scanner.nextInt();
    }

    public static int InputDay() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день:");

        return scanner.nextInt();
    }

}
