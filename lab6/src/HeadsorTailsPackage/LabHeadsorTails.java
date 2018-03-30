/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeadsorTailsPackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class LabHeadsorTails {


    public static void main(String[] args) {
        
        int Heads = LogicHeadsorTails.Heads();
        int Tails = LogicHeadsorTails.Tails(Heads);
        
        view.print(Heads, Tails);
    }
    
}
