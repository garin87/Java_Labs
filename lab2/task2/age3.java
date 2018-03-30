import java.io.*;
import java.util.*;


class ageUser{
 
  public static void main(String args[]) {
    int year = UserInput.years();
    int  month = UserInput.months();
    int day = UserInput.days();
   
    
    long daysBetween = ageLogic.ageUserDays(year, month, day);
    long hoursBetween = ageLogic.ageUserHour(daysBetween);
    long minutesBetween = ageLogic.ageUserMinutes(daysBetween);
    long secondsBetween = ageLogic.ageUserSeconds(daysBetween);
    long millisecondsBetween = ageLogic.ageUserMilliseconds(daysBetween);

    view.show( daysBetween,hoursBetween,  minutesBetween, secondsBetween,  millisecondsBetween);
    
  }
  

}