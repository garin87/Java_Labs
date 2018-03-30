import java.util.Scanner;

public class B2{

	public static void main(String[] args){

      double distanceСentimeters = 0;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите растояние между городами в сантиметрах: ");
        distanceСentimeters = scanner.nextDouble();
       

      System.out.println("Растояние между городами в метрах:" + b2Logic.distanceMeter( distanceСentimeters));
      System.out.println("растояние между городами в километрах:" + b2Logic.sizeKilometer( distanceСentimeters));
 
   }


}