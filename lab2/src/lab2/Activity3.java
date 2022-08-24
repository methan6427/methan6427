package lab2;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a 3digit number:");
		int num=input.nextInt();
		int mod= num%10;
		int div=num/100;
		if (mod==div)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}

	}

}
