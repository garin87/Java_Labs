/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeadsorTailsPackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
import java.util.Random;

public class LogicHeadsorTails {

    public static int Heads() {

        Random rand = new Random();

        int Head = 1;
        int countHeads = 0;
        int result; 

        for (int i = 0; i < 1000; i++) {
            result = rand.nextInt(2) + 1;
            if (result == Head) {
                countHeads++;
            }
        }

        return countHeads;
    }

    public static int Tails(int countHeads) {

        return 1000 - countHeads;
    }
}
