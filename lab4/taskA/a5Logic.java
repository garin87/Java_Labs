public class a5Logic {
	
	public static boolean compare5(double a, double b, double c) {
		
      return (a > 0 && c < 0 && b < 0) || (b > 0 && c < 0 && a < 0) || (c > 0 && a < 0 && b < 0);

	}

}