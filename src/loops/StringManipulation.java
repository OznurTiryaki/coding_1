package loops;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {

		// Program Area code to accept phone number in one of two formats (202)3334444
		// or 2023334444

		Scanner scan = new Scanner(System.in);

		String phoneNumber = scan.next();
		String areaCode = "";
		String state = "";
		if (phoneNumber.startsWith("(")) {
			
			areaCode = phoneNumber.substring(1, 4);
			
		} else {
			areaCode = phoneNumber.substring(0, 3);

		}
		switch (areaCode) {

		case "202":
			state = "Washington DC";
			break;
		case "703":
			state = "Virginia";
			break;
		case "209":
			state = "California";
			break;
		case "312":
			state = "Illinois";
			break;
		case "347":
			state = "New York";
			break;
		default:
			state = "not in database";
			break;
		}
		System.out.println(state);
	}
}
