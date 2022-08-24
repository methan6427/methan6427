package lab5;

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int num = input.nextInt();
		System.out.println(fact(num));

	}

	public static int fact(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * fact(--num);
		}

	}

}
