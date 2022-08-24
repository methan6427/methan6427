package markis99;

import java.util.Scanner;

public class Passenger {

	private static String Fname = null;
	private static String Lname = null;
	private  static double Age = 0;
	private static String Gender = null;
	private static long PassPort = 0;
	private static String Nationality = "palestinian";
	private static int PassCount = 0;
	Scanner input = new Scanner(System.in);

	Passenger(String fname1, String lname1, int age1, char gender1, int passPort2, String nationality1) {

	}

	Passenger(String Fname, String Lname, Double Age, String Gender, long PassPort, String nationality, int PassCount) {

	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public double getAge() {
		return Age;
	}

	public void setAge(double age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public long getPassPort() {
		return PassPort;
	}

	public void setPassPort(long passPort) {
		PassPort = passPort;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public static int getPassCount() {
		return PassCount;
	}

	public static void setPassCount(int passCount) {
		PassCount = passCount;
	}

	public static void printPassengerInfo() {
			System.out.println(Fname);
			System.out.println(Lname);
			System.out.println(Age);
			System.out.println(Gender);
			System.out.println(PassPort);
			
				}
			
		

	

}