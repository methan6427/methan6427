package lab8;

import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[]n=new double[10];
		System.out.println("enter 10 numbers");
		for(int i=0; i<n.length; i++) {
			n[i]=input.nextInt();
			
		}
		System.out.println(min(n));

	}
	public static double min(double[] array) {
		double min=array[0];
		for(int i=1; i<array.length; i++) {
			if (min>array[i]) {
				min=array[i];
				
			}
		}
		return min;
	}

}
