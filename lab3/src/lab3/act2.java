package lab3;

import java.util.Scanner;

public class act2 {

	public static void main(String[] args) {
		double e=1;
		for(int i=1; i<=10; i++) {
			int fact=1;
			 for ( int f=i; f > 1; f--) {
				 
				 fact*=f;
				 e+=1.0/fact;
				
			 }
			 }
	               
		 System.out.println("e10= " + e);
		
		
		}
	

}
