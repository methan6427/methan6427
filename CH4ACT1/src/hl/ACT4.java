package hl;

import java.util.Scanner;

public class ACT4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the nos ");
		int sid=input.nextInt();
		System.out.println("the side size");
		double length=input.nextDouble();
		System.out.println(polygon(sid,length));

	}
public static double polygon(int sid,double length) {
	
	double area=(sid*Math.pow(length, 2))/(4*Math.tan(Math.PI/sid));
	return area;
}
	 
}
