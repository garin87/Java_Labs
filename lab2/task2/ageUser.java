  import java.time.LocalDate;
  import java.time.temporal.ChronoUnit;


  public class ageLogic{

     public static long ageUserDays(int year, int month, int day){
    
     LocalDate firstDate = LocalDate.of(year, month, day);
     LocalDate now = LocalDate.now();
    
     return ChronoUnit.DAYS.between(firstDate, now); 
     }


 }