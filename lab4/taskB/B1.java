import java.util.Scanner;

public class B1{

	public static void main(String[] args){

      double sizeByte = 0;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите размер файла в байтах: ");
         sizeByte = scanner.nextDouble();
       

      System.out.println(" Размер файла в килобайтах:" + b1Logic.sizeKilobyte( sizeByte));
      System.out.println(" Размер файла в мегабайтах:" + b1Logic.sizeMegabyte( sizeByte));
      System.out.println(" Размер файла в гигабайтах:" + b1Logic.sizeGigabyte( sizeByte));
   }


}