/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moodpackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
import java.util.Random;

public class logicMood {
    public static String MoodFace(){
    
    String[] differentMood = {"\uD83D\uDE42","\uD83D\uDE20","\uD83D\uDE2D", "\uD83D\uDE23"};    
    
    Random rand = new Random();
    
    int count = rand.nextInt(differentMood.length) + 0;
    
    return differentMood[count];
 }
}
