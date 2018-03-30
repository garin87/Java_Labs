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
public class labDice {
    
    public static void main(String[] args){
        
        int resultDice1 = logicDice.gameDice1();
        int resultDice2 = logicDice.gameDice2();
        int result = resultDice1 + resultDice2;
        
        view.print(resultDice1, resultDice2, result);
    }
}
