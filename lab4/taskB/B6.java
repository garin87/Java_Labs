import java.util.Scanner;

public class B6{

	public static void main(String[] args){

      int number = 0;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите число: ");
        number = scanner.nextInt();
       

      System.out.println("Арифметическое среднее цифр введенного числа: " + b6Logic.averageArithmeticNumber( number));
      System.out.println("Геометрическое среднее цифр введенного числа: " + b6Logic.averageGeometricNumber( number));
   }


}