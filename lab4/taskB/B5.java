import java.util.Scanner;

public class B5{

	public static void main(String[] args){

       int number = 0;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите число: ");
        number = scanner.nextInt();
       

      System.out.println("Сумма цифр введеннго числа:" + b5Logic.sumNumber( number));

   }


}