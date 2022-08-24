package lab5;

import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		long n=input.nextLong();
		System.out.println(SumDigits(n));

	}
	public static int SumDigits(long n) {
		if (n<10)
			return (int)n;
		return (int)((n%10)+SumDigits(n/10));
	}

}
