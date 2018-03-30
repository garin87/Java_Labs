/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DragonPackage;


/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
import java.util.Scanner;

public class InputUser {

    public static int InputHead() {
        int year_dragon;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите возраст дракона: ");
            year_dragon = scanner.nextInt();
        } while (year_dragon < 1 || year_dragon > 10000);

        return year_dragon;
    }
}
