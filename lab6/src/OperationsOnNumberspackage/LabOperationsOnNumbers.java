/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationsOnNumberspackage;
import java.util.List;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LabOperationsOnNumbers {
    
     public static void main(String[] args) {
         
         int n = UserInput.inputNumber();
         int x = UserInput.inputGCDNumber();
         int sum = LogicOperationsOnNumbers.sumNumber(n);
         int amount = LogicOperationsOnNumbers.amountNumber(n);
         int different = LogicOperationsOnNumbers.differentNumber(n);
         int max = LogicOperationsOnNumbers.maxNumber(n);
         boolean palindrome = LogicOperationsOnNumbers.palindromeNumber(n);
         boolean prime = LogicOperationsOnNumbers.primeNumber(n);
         List<Integer> divide = LogicOperationsOnNumbers.primeDivideNumber(n);
         int GCD = LogicOperationsOnNumbers.GCDNumber(n, x);
         int LCM = LogicOperationsOnNumbers.LCMNumber(n, x);
         view.print(sum,amount, different, max, palindrome,prime,  divide, GCD, LCM);
     }
}
