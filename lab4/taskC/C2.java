import java.util.Scanner;

public class C2{

	public static void main(String[] args){

      double a = 0;
      double b = 0;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите длину стороны a прямоугольника: ");
      a = scanner.nextDouble();
      System.out.print("Введите длину стороны b прямоугольника:: ");
      b = scanner.nextDouble(); 

      System.out.println("Периметр рямоугольника равен: " + RectangleCalculator.calatePerimeter(a,b));
      System.out.println("Плащадь рямоугольника равна: " + RectangleCalculator.calculateArea(a,b));
   }


}