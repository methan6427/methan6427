package hl;

import java.util.Scanner;

public class ACT3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count=0;
		for(int 
				i=2; i<num; i++)
		if (IsPrime(num)) {
			count++;
		}
		System.out.println(count);
	}

	public static boolean IsPrime(int num) {
	boolean flag=false;
		for(int i=2; i<num; i++) {
			if (num%i!=0) {flag= true;
			
			}
			
		}
		return flag;
	}

}
