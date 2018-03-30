import java.util.Scanner;

public class C1{

	public static void main(String[] args){

      double a = 0;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите длину стороны квадрата: ");
      a = scanner.nextDouble();
       

      System.out.println("Периметр квадрата равен: " + SquereCalculator.calatePerimeter(a));
      System.out.println("Плащадь квадрата равна: " + SquereCalculator.calculateArea(a));
   }


}