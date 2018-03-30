/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessNumberPackage;
import java.util.*;
/**
 * 29.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LogicGuessNumber {

    public static int RanNumber(int a, int b) {
        Random rand = new Random();

        int c = rand.nextInt(a) + b;

        return c;
    }

    public static int GuessNumber(int n, int c) {

        int count = 1;

        System.out.println(c);
        while (n != c && count < 10) {

            if (n > c) {
                System.out.println("Wrong!");
                System.out.println("Last guess was too high!");
            } else {
                System.out.println("Wrong!");
                System.out.println("Last guess was too low!");

            }

            n = UserInput.InputNumber();

            if (n == c) {

                System.out.println("Congratulations! You got it right!");
                System.out.println("You guessed the number in attempts: " + (count + 1));
                LogicGuessNumber.restGame(n, c);

                break;
            }
            count++;
        }

        if (count >= 10) {
            System.out.println("!!!GAME OVER!!!");
            System.out.println("Correct number: " + c);
            LogicGuessNumber.restGame(n, c);
        }

        return count;
    }

    public static void restGame(int n, int c) {

        int rest = UserInput.InputRest();
        if (rest == 1) {

            LogicGuessNumber.GuessNumber(UserInput.InputNumber(), LogicGuessNumber.RanNumber(UserInput.InputA(), UserInput.InputB()));

        } else if (rest == 0) {
            System.out.println("End");
        } else {
            restGame(n, c);
        }

    }

}
