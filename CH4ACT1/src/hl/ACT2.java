package hl;

import java.util.Scanner;

public class ACT2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.println("the result is" + Reverse( num));
	}
	public static long Reverse(int num) {
		
		long res=0;
		long rev=0;
		while(num>0) {
			rev=num%10;
			res+=rev;
			res*=10;
			num/=10;
		}
		res/=10;
		return res;
		
	}

}
