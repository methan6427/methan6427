package lab1;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter the height:");
		double height=input.nextDouble();
		System.out.println("enter the width:");
		double width= input.nextDouble();
		System.out.println("the area is :" + height*width );
		System.out.println("the perimetir is :" + ((2*height)+(2*width)));

	}

}
