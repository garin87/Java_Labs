/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessNumberPackage;
/**
 * 29.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LabGuessNumber {
    
     public static void main(String[] args) {
        
         view.print("***Try to Guess the Number***");
         int a = UserInput.InputA();
         int b =  UserInput.InputB();
         int n =  UserInput.InputNumber();
         int c =  LogicGuessNumber.RanNumber(a, b);
         int GuessN = LogicGuessNumber.GuessNumber(n,c);
        
         
     }
}
