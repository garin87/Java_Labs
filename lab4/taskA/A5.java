import java.util.Scanner;

public class A5{

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

     System.out.println("Введенные числа имеют только одно  положительное число:" + a5Logic.compare5( A, B, C));

   }


}