/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author rtty
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
