import java.util.Scanner;

public class B3{

	public static void main(String[] args){

      double weightGrams = 0;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите вес динозавра в граммах: ");
        weightGrams = scanner.nextDouble();
       

      System.out.println("Вес динозавра в килограммах:" + b3Logic.weightKilogram( weightGrams));
      System.out.println("Вес динозавра в центнерах:" + b3Logic.weightCentner( weightGrams));
      System.out.println("Вес динозавра в тоннах:" + b3Logic.weightTon( weightGrams));

   }


}