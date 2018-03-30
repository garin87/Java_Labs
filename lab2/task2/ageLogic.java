  import java.time.LocalDate;
  import java.time.temporal.ChronoUnit;


  public class ageLogic{

     public static long ageUserDays(int year, int month, int day){
    
     LocalDate firstDate = LocalDate.of(year, month, day);
     LocalDate now = LocalDate.now();
    
     return ChronoUnit.DAYS.between(firstDate, now); 
     }
     
     public static long ageUserHour(long daysBetween){
       return daysBetween * 24;
     }

     public static long ageUserMinutes(long daysBetween){
       return daysBetween* 24 * 60;
     }
     
     public static long ageUserSeconds(long daysBetween){
       return daysBetween* 24 * 60* 60;
     }
     
     public static long ageUserMilliseconds(long daysBetween){
       return daysBetween* 24 * 60* 60*1000;
     }
 }