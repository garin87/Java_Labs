
import java.lang.*;

public class b6Logic {
	
	public static float averageArithmeticNumber(int  Number) {
        float sum = 0;
	    float count = 0; 

        while(Number != 0){
          sum += (Number % 10);
          Number/=10;
          count++;
        }

        return sum / count;
	}
	public static double averageGeometricNumber(int  Number) {
         double multipl = 0;
	     double count = 0; 

         while(Number != 0){
           multipl *= (Number % 10);
           Number/=10;
           count++;
        }
         
         
         return Math.pow(multipl,1.0/count);
	}
    
}