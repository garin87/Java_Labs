import java.util.Scanner;

public class A4{

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

     System.out.println("Введенные числа имеют хотя бы одно  положительное число:" + a4Logic.compare4( A, B, C));

   }


}