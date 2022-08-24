package hl;

import java.util.Scanner;

public class CH1ACT5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the celecius degree:");
		double cel=input.nextDouble();
		double fah=(9.0/5.0)*cel+32;
		System.out.println("the fahrenheit degree is :" + fah);	}

}
