package hl;

import java.util.Scanner;

public class CH1ACT4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the width and the height");
		double width=input.nextDouble();
		double height=input.nextDouble();
		System.out.println("the perimeter is " +(2*width)+(2*height));
		System.out.println("the area is " +( width*height ));

	}

}
