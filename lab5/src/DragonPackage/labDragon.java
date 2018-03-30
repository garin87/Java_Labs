/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DragonPackage;
/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class labDragon {

    public static void main(String[] args) {

        int eyes;
        int head = 0;
        int age;
        
        age = InputUser.InputHead();
        head =  DragonLogic.HeadLogic(age);
        eyes  = DragonLogic.DragonEyes( head);
        
        veiw.print(head,eyes);
       
    }
}
