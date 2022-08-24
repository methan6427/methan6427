package lab5;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the first number");
		int a = input.nextInt();
		System.out.print("enter the second number");
		int b = input.nextInt();
		System.out.println(GCD(a,b));
		

	}
	public static int GCD(int x,int y) {
		if (x%y==0)
			return y;
		return GCD(y,x%y);
		
	}

}
