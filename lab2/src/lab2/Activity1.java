package lab2;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number between 1 & 12:");
		int num = input.nextInt();
		if (num == 1) {
			System.out.println("january");
		} else if (num == 2) {
			System.out.println("february");
		} else if (num == 3) {
			System.out.println("march");
		} else if (num == 4) {
			System.out.println("april");
		} else if (num == 5) {
			System.out.println("may");
		} else if (num == 6) {
			System.out.println("june");
		} else if (num == 7) {
			System.out.println("july");
		} else if (num == 8) {
			System.out.println("august");
		} else if (num == 9) {
			System.out.println("september");
		} else if (num == 10) {
			System.out.println("october");
		} else if (num == 11) {
			System.out.println("november");
		} else if (num == 12) {
			System.out.println("december");
		}

	}

}
