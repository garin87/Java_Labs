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
public class DragonLogic {

    public static int HeadLogic(int year_dragon) {

        int dragon_head = 0;

        if (year_dragon <= 200) {
            dragon_head = year_dragon * 3;
        } else if (year_dragon <= 300 && year_dragon > 200) {
            dragon_head = (year_dragon - 100) * 2 + 300;
        } else if (year_dragon > 300) {
            dragon_head = (year_dragon - 200) * 1 + 300 + 200;
        }
        return dragon_head;
    }

    public static int DragonEyes(int dragon_head) {

        return dragon_head * 2;
    }
}
