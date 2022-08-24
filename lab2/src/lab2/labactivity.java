package lab2;

import java.util.Scanner;

public class labactivity {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a 4 digit number :");
		int num=input.nextInt();
		int d1=num%10;
		int d2=(num/10)%10;
		int d3=(num/100)%10;
		int d4=num/1000;
		
	
		   if(d1==d4 && d2==d3)
		   {
			   System.out.println("palindrom");
		   }
		   else 
		   {
			   System.out.println("not palindrom");
		   }
			
		
	}

}
