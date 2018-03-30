/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

/**
 * 28.03.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class labData {
    
    public static void main(String[] args){
        
        int year = UserInput.InputYear();
        int month = UserInput.InputMonth();
        int day = UserInput.InputDay();
        
        boolean leapYear = LogicData.Yearleap(year);
        int YearNext = LogicData.NextYear(leapYear, year, month, day);
        int MonthNext = LogicData.NextMonth(leapYear, year, month, day);
        int DayNext = LogicData.NextDay(leapYear, year, month, day);
        
        view.printNextData(YearNext, MonthNext, DayNext);
    }
}
