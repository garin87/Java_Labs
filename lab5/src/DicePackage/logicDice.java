/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DicePackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
import java.util.Random;

public class logicDice {

    public static int gameDice1() {

        Random rand = new Random();

        int cube1 = rand.nextInt(6) + 1;

        return cube1;
    }

    public static int gameDice2() {

        Random rand = new Random();

        int cube2 = rand.nextInt(6) + 1;

        return cube2;
    }

}
