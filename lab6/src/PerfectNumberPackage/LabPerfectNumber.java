/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerfectNumberPackage;
/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LabPerfectNumber {
    
    public static void main(String[] args) {
        
     int number = UserInput.inputNumber();
     
     boolean resultNumber = LogicPerfectNumber.PerfectNumber(number);
     
     view.print(resultNumber);
    }
}
