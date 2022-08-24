package Gara;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner first = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER:");
		double x = first.nextDouble();
		System.out.println("enter the type of the equation");
		System.out.println("1.SUM");
		System.out.println("2.SUB");
		System.out.println("3.MUL");
		System.out.println("4.DIV");
		System.out.println("5.MOD");
		double s = first.nextDouble();
		System.out.println("ENTER THE SECOND NUMBER:");
		double y = first.nextDouble();
		if (s == 1) {
			System.out.println("the answer is:" + (x + y));
		} else if (s == 2) {
			System.out.println("the answer is:" + (x - y));
		} else if (s == 3) {
			System.out.println("the answer is:" + (x * y));
		} else if (s == 4) {
			System.out.println("the answer is:" + (x / y));
		} else if (s == 5) {
			System.out.println("the answer is:" + (x % y));
		} else {
			System.out.println("INVALID CHOICE!!!!");
			System.out.println("PLEASE CHOOSE A VALID NUMBER");
		}
		first.close();
	}

}
