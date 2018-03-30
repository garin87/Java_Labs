
import java.util.Scanner;

public class A2{

	public static void main(String[] args){

      double A = 0;
	    double B = 0;
	    double C = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
           A = scanner.nextDouble();
        System.out.print("Введите число B: ");
           B = scanner.nextDouble();
        System.out.print("Введите число C: ");
           C = scanner.nextDouble();

     System.out.println("Среди введенных чисел есть хотя бы одна пара совподающих чисел:" + a2Logic.compare2( A, B, C));

   }


}