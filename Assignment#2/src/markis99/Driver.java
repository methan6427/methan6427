package markis99;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int passcount=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the following for the FIRST passenger:");
		System.out.print("\n first num"+"\n second num"+"\n age"+"\n gender"+"\n passport number");
		String Fname1 = input.next();
		String Lname1 = input.next();
		int Age1 = input.nextInt();
		char Gender1 = input.next().charAt(0);
		int PassPort = input.nextInt();
		int Seven= PassPort;
		String Nationality1 = input.next();
		while(Seven>0) { Seven/=10; passcount++; }
		if (passcount<7) {System.out.println("the passport number should contain 7 charachters");}
		Passenger myPass1=new Passenger(Fname1, Lname1, Age1, Gender1, PassPort, Nationality1);
		
		
		
		
		System.out.println("enter the following for the SECOND passenger:");
		System.out.print("\n first num"+"\n second num"+"\n age"+"\n gender"+"\n passport number");
		 Fname1 = input.next();
		 Lname1 = input.next();
		 Age1 = input.nextInt();
		 Gender1 = input.next().charAt(0);
		 PassPort = input.nextInt();
		 Seven= PassPort;
		 Nationality1 = input.next();
		while(Seven>0) { Seven/=10; passcount++; }
		if (passcount<7) {System.out.println("the passport number should contain 7 charachters");}
		Passenger myPass2=new Passenger(Fname1, Lname1, Age1, Gender1, PassPort, Nationality1);
		
		

		System.out.println("enter the following for the THIRD passenger:");
		System.out.print("\n first num"+"\n second num"+"\n age"+"\n gender"+"\n passport number");
		 Fname1 = input.next();
		 Lname1 = input.next();
		 Age1 = input.nextInt();
		 Gender1 = input.next().charAt(0);
		 PassPort = input.nextInt();
		 Seven= PassPort;
		 Nationality1 = input.next();
		while(Seven>0) { Seven/=10; passcount++; }
		if (passcount<7) {System.out.println("the passport number should contain 7 charachters");}
		Passenger myPass3=new Passenger(Fname1, Lname1, Age1, Gender1, PassPort, Nationality1);
		
		
		
		if(myPass1.getAge()>myPass2.getAge() && myPass1.getAge()> myPass3.getAge())
			myPass1.printPassengerInfo();
		else if(myPass2.getAge()>myPass1.getAge() && myPass2.getAge()> myPass3.getAge())
			myPass2.printPassengerInfo();
		else 
			myPass3.printPassengerInfo();
		if(myPass1.getAge()<myPass2.getAge() && myPass1.getAge()> myPass3.getAge() || myPass1.getAge()>myPass2.getAge() && myPass1.getAge()< myPass3.getAge())
			myPass1.printPassengerInfo();
		if(myPass2.getAge()<myPass1.getAge() && myPass2.getAge()> myPass3.getAge() || myPass2.getAge()>myPass1.getAge() && myPass2.getAge()< myPass3.getAge())
			myPass2.printPassengerInfo();
		if(myPass3.getAge()<myPass2.getAge() && myPass3.getAge()> myPass1.getAge() || myPass3.getAge()>myPass2.getAge() && myPass3.getAge()< myPass1.getAge())
			myPass3.printPassengerInfo();
		if(myPass1.getAge()<myPass2.getAge() && myPass1.getAge()< myPass3.getAge())
			myPass1.printPassengerInfo();
		else if(myPass2.getAge()<myPass1.getAge() && myPass2.getAge()< myPass3.getAge())
			myPass2.printPassengerInfo();
		else 
			myPass3.printPassengerInfo();
		
		
		
		
		
		}

	}


