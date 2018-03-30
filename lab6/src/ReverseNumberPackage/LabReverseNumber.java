/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseNumberPackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LabReverseNumber {
    public static void main(String[] args) {
     
     int number = UserInput.UserN();
     int reverseNumber = LogicReverseNumber.reverse(number);
     
     view.print(reverseNumber);
    } 
}
