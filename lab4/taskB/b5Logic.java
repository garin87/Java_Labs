public class b5Logic {
	
	public static int sumNumber(int  Number) {
	 int sum = 0;  
     while(Number != 0){
        sum += (Number % 10);
        Number/=10;
     }
      return sum;
	}


}