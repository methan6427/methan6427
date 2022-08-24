package lab7;

import java.util.Date;

public class labr {

	public static void main(String[] args) {
		times(100);
	
	}
	
	static void times(long i) {
		Date da=new Date();
		if (i<1000000000000L) {
			da.setTime(i);
			System.out.print(i+"\t");
			System.out.print(da+"\n");
		times(i*10);
		}
		
	}

}
