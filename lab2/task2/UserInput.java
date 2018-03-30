import java.io.*;
import java.util.Scanner;


public class UserInput {
  public static int years(){
    
     Scanner scanner = new Scanner(System.in);
     System.out.print("Введите год рождения:");
    
     return scanner.nextInt();
  }
  
  public static int months(){
    
     Scanner scanner = new Scanner(System.in);
     System.out.print("Введите месяц рождения:");
    
     return scanner.nextInt();
  }
  public static int days(){
    
     Scanner scanner = new Scanner(System.in);
     System.out.print("Введите день рождения:");
    
     return scanner.nextInt();
  }
}
