import java.util.Scanner;

public class C3{

	public static void main(String[] args){

      double r = 0;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите радиус окружности: ");
      r = scanner.nextDouble();


      System.out.println("Длина окружности равна: " + Calculator.calculatePerimeter(r));
      System.out.println("Плащадь окружности равна: " + Calculator.calculateArea(r));
   }


}