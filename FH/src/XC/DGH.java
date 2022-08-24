package XC;

import java.util.Scanner;

public class DGH {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[]n=new int[10];
		for (int i = 0; i < n.length; i++) {
			System.out.print("enter a number:");
			n[i]=input.nextInt();
			
		}
		for (int i = n.length-1; i >= 0; i--) {
			System.out.println(n[i]);
		}
		
	}
}


