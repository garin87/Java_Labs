public class a6Logic {
	
	public static boolean compare6(double a, double b, double c) {
		
      return (a > 0 && c > 0 && b < 0) || (b > 0 && c > 0 && a < 0) || (c > 0 && a > 0 && b < 0) || (c > 0 && a > 0 && b > 0) ;

	}

}