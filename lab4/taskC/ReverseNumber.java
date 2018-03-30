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
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        int a;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        a = scanner.nextInt();

        System.out.println("Перевернутое введенное число: " + reverseLogic.reverse(a));

    }

}
