/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessNumber;

/**
 * 28.05.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */

public class lab7_GuessNumber {
    
      public static void main(String[] args){
         
        int a = UserInput.InputA();
        int b =  UserInput.InputB();
        int number =  UserInput.InputNumber();
        View.print("***Try to Guess the Number***");
        int find = Logic.find(number, a, b);
        
        
        
      }
}
