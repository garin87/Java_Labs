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
public class labMood {
    
     public static void main(String[] args){
         
         String mood = logicMood.MoodFace();
         
         viewMood.print(mood);
     }
}
