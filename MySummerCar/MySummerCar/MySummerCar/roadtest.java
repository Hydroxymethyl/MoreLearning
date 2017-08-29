package MySummerCar;

import java.util.Scanner;

public class roadtest {
	public static void roadtest2 () {
		
		
	}

	public static String getStringFromUser() {
		return (new Scanner(System.in).nextLine());
	}

	public static void main(String[] args) {

		boolean driveType = false;
		int driveHelp = 0;

		System.out.println("What car model?");
		String Model = getStringFromUser();
		driveHelp++;
		if (driveHelp == 1) {
			System.out.println("What color?");
			String Colorresponse = getStringFromUser();
			driveHelp++;
		}
		if (driveHelp == 2) {
			System.out.println("What make do you drive");
			String Make = getStringFromUser();
			driveHelp++;
		}
		if (driveHelp == 3) {
			System.out.println("Alright lets drive!");
			String Drive = getStringFromUser();
			driveHelp++;
		}

	} 
	


}
