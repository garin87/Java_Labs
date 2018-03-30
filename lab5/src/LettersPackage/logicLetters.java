/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LettersPackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class logicLetters {

    public static boolean Letters(char letter) {

        char[] Vowel = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        boolean answer = false;
        for (int i = 0; i < Vowel.length; i++) {
            if (Vowel[i] == letter) {
                answer = true;
            }
        }

        return answer;
    }

    public static boolean Letters2(char letter) {

        boolean answer = false;

        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            answer = true;
        }

        return answer;
    }

    public static boolean Letters3(char letter) {

        boolean answer = false;

        String s = "AaEeIiOoUu";

        if (s.indexOf(letter) != -1) {
            answer = true;
        }

        return answer;
    }
    
}
