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
public class labLetters {
    
    public static void main(String[] args){
      
        char userchar = inputUser.input();
        boolean character = logicLetters.Letters(userchar);
        
        view.print(character);
    }
}
