package lab1;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("the the celicuis degree:");
		double cel=input.nextDouble();
		double fah=(9.0/5.0)*cel+32;
		System.out.println("the degree in fehrenheit is :" + fah);

	}

}
