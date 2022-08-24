package hl;

import java.util.Scanner;

public class act1 {

	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter the number");
	 long num=input.nextInt();
	 System.out.println("the result is" + SumDigits(num));
	
	 
	 
	 
		

	}
	public static long SumDigits(long n) {
		long rem=0;
		long res=0;
		while (true) {
		
		while (n>0) {
			rem=n%10;
			res+=rem;
			n/=10;
		}
		if (res<10)
			return res;
		n=res;
		}
		
	}

}
