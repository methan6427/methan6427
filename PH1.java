package p;

import java.util.Scanner;

public class PH1 {
	public static Scanner input = new Scanner(System.in);
	public static boolean flag1 = false;
	public static boolean flag2 = false;
	public static boolean flag3 = false;
	public static boolean flag4 = false;
	public static boolean flag5 = false;
	public static boolean flag6 = false;
	public static boolean flag7 = false;
	public static boolean flag8 = false;
	public static boolean flag9 = false;
	public static boolean flag10 = false;
	public static boolean flag11 = false;
	public static boolean flag12 = false;
	public static boolean flag13 = false;
	public static boolean flag14 = false;
	public static boolean flag15 = false;
	public static boolean flag16 = false;
	public static boolean flag17 = false;
	public static boolean flag18 = false;
	public static boolean flag19 = false;
	public static boolean flag20 = false;
	public static boolean flag21 = false;
	public static boolean flag22 = false;
	public static boolean flag23 = false;
	public static boolean flag24 = false;
	public static boolean flag25 = false;
	public static boolean flag26 = false;
	public static boolean flag27 = false;
	public static boolean flag28 = false;
	public static boolean flag29 = false;
	public static boolean flag30 = false;
	public static boolean flag31 = false;
	public static boolean flag32 = false;
	public static boolean flag33 = false;
	public static boolean flag34 = false;
	public static boolean flag35 = false;
	public static boolean flag36 = false;
	public static boolean flag37 = false;
	public static boolean flag38 = false;
	public static boolean flag39 = false;
	public static boolean flag40 = false;
	public static boolean flag41 = false;
	public static boolean flag42 = false;
	public static boolean flag43 = false;
	public static boolean flag44 = false;
	public static boolean flag45 = false;
	public static boolean flag46 = false;
	public static boolean flag47 = false;
	public static boolean flag48 = false;
	public static boolean flag49 = false;
	public static boolean flag50 = false;

	public static void main(String[] args) {
		System.out.println("Please Select an Option (1-6) :");
		System.out.println("1- Reserve an available room.");
		System.out.println("2- Choose room type : single , double , deluxe ,king");
		System.out.println("3- Change room");
		System.out.println("4- Delete the reserved room.");
		System.out.println("5- Delete all reserved rooms.");
		System.out.println("6- Show all reserved rooms information");
		System.out.println("7- Exit System.");
		int num = input.nextInt();
		while (num != 7) {
			if (num >= 1 && num <= 7) {
			} else {
				System.out.println("enter a valid number");
				num = input.nextInt();
			}
			if (num == 1) {
				reserveRoom();
			} else if (num == 2) {
				selectRoomType();
			} else if (num == 3) {
				changeRoom();
			} else if (num == 4) {
				deleteReservedRoom();
			} else if (num == 5) {
				deleteAllReservedRoom();
			} else if (num == 6) {
				showAllReservedRoomsInformation();
			}
			System.out.println("1- Reserve an available room.");
			System.out.println("2- Choose room type : single , double , deluxe ,king");
			System.out.println("3- Change room");
			System.out.println("4- Delete the reserved room.");
			System.out.println("5- Delete all reserved rooms.");
			System.out.println("6- Show all reserved rooms information");
			System.out.println("7- Exit System.");
			num = input.nextInt();
		}

	}

	public static void reserveRoom() {
		int roomNumber = 0;
		boolean flag=false;
		System.out.print("enter a number between ( 1 - 50 )");
		roomNumber = input.nextInt();
		if (!isValid(roomNumber)) {
			System.out.println("the number is not valid");
			reserveRoom();
		} else {
			if (roomNumber == 1) {
				if (!flag1) {
					flag1 = true;
					flag=true;
				} else {
					System.out.println("the seat is not empty");
				}
			}
				if (roomNumber == 2) {
					if (!flag2) {
						flag2 = true;
						flag=true;
					
				} else {
					System.out.println("the seat is not empty");
				}}
				if (roomNumber == 3) {
					if (!flag3) {
						flag3 = true;
						flag=true;
					} else {
						System.out.println("the seat is not empty");
					}
				}
				if (roomNumber == 4) {
					if (!flag4) {
						flag4 = true;
						flag=true;
					} else {
						System.out.println("the seat is not empty");
					}
				}
			}
			if (roomNumber == 5) {
				if (!flag5) {
					flag5 = true;
					flag=true;
				} else {
					System.out.println("the seat is not empty");
				}
			}
		if (roomNumber == 6) {
			if (!flag6) {
				flag6 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 7) {
			if (!flag7) {
				flag7 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 8) {
			if (!flag8) {
				flag8 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 9) {
			if (!flag9) {
				flag9 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 10) {
			if (!flag10) {
				flag10 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 11) {
			if (!flag11) {
				flag11 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 12) {
			if (!flag12) {
				flag12 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 13) {
			if (!flag13) {
				flag13 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 14) {
			if (!flag14) {
				flag14 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 15) {
			if (!flag15) {
				flag15 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 16) {
			if (!flag16) {
				flag16 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 17) {
			if (!flag17) {
				flag17 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 18) {
			if (!flag18) {
				flag18 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 19) {
			if (!flag19) {
				flag19 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 20) {
			if (!flag20) {
				flag20 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 21) {
			if (!flag21) {
				flag21 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 22) {
			if (!flag22) {
				flag22 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 23) {
			if (!flag23) {
				flag23 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 24) {
			if (!flag24) {
				flag24 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 25) {
			if (!flag25) {
				flag25 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 26) {
			if (!flag26) {
				flag26 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 27) {
			if (!flag27) {
				flag27 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 28) {
			if (!flag28) {
				flag28 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 29) {
			if (!flag29) {
				flag29 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 30) {
			if (!flag30) {
				flag30 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 31) {
			if (!flag31) {
				flag31 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 32) {
			if (!flag32) {
				flag32 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 33) {
			if (!flag33) {
				flag33 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 34) {
			if (!flag34) {
				flag34 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 35) {
			if (!flag35) {
				flag35 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 36) {
			if (!flag36) {
				flag36 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 37) {
			if (!flag37) {
				flag37 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 38) {
			if (!flag38) {
				flag38 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 39) {
			if (!flag39) {
				flag39 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 40) {
			if (!flag40) {
				flag40 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 41) {
			if (!flag41) {
				flag41 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 42) {
			if (!flag42) {
				flag42 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 43) {
			if (!flag43) {
				flag43 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 44) {
			if (!flag44) {
				flag44 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 45) {
			if (!flag45) {
				flag45 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 46) {
			if (!flag46) {
				flag46 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 47) {
			if (!flag47) {
				flag47 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 48) {
			if (!flag48) {
				flag48 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 49) {
			if (!flag49) {
				flag49 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (roomNumber == 50) {
			if (!flag50) {
				flag50 = true;
				flag=true;
			} else {
				System.out.println("the seat is not empty");
			}
		}
		if (flag) {
			System.out.println("seat is reserved");
		}

	}

	public static void selectRoomType() {
		System.out.println("please , enter the room type name :");
		System.out.println("1.SINGLE.");
		System.out.println("2.DOUBLE.");
		System.out.println("3.DELUXE.");
		System.out.println("4.KING.");
		input.nextLine();
		String roomType = input.nextLine();
		roomType = roomType.toUpperCase();
		roomType=roomType.trim();
		System.out.println(roomType);
		if (roomType.equals("SINGLE") || roomType.equals("DOUBLE")  || roomType.equals("DELUXE") || roomType.equals("KING")) {
			System.out.println("the room type " + roomType + " is reserved");
		} else {
			System.out.print("enter a valid type :");
			selectRoomType();
		}
	}

	public static void changeRoom() {
		int roomNumber = 0;
		System.out.print("enter a number between ( 1 - 50 )");
		roomNumber = input.nextInt();
		if (roomNumber >= 1 && roomNumber <= 50) {
			System.out.println("room number" + roomNumber + "is changed");
		} else {
			System.out.println("enter a valid number between ( 1 - 50 )");
			changeRoom();
		}

	}

	public static void deleteReservedRoom() {
		int roomNumber = 0;
		System.out.print("enter a number between ( 1 - 50 )");
		roomNumber = input.nextInt();

	}

	public static void deleteAllReservedRoom() {
		System.out.println("all the reserved room is deleted and available to be reserved");
	}

	public static void showAllReservedRoomsInformation() {
		System.out.println("thanks for booking with us ");
	}

	public static boolean isValid(int roomNumber) {
		if (roomNumber >= 1 && roomNumber <= 50) {
			return true;
		} else {
			System.out.println("enter a valid number between ( 1 - 50 )");
			return false;
		}

	}

}
