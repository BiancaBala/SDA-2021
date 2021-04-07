package Laborator2;

import java.util.*;

public class P1_cond_instr {

	public static String roadType1(String input) {
		if (input.equals("oras"))
			return "oras - 50";
		else {
			if (input.equals("zona rezidentiala"))
				return "zona rezidentiala - 30";
			else {
				if (input.equals("drum express"))
					return "drum express - 100";
				else {
					if (input.equals("autostrada"))
						return "autostrada - 130";
					else
						return "This type of road does not exist!";
				}
			}
		}
	}

	public static String roadType2(String input) {

		if (input.equals("oras"))
			return "oras - 50";
		else if (input.equals("zona rezidentiala"))
			return "zona rezidentiala - 30";
		else if (input.equals("drum express"))
			return "drum express - 100";
		else if (input.equals("autostrada"))
			return "autostrada - 130";
		else
			return "This type of road does not exist!";
	}

	public static String roadType3(String input) {

		switch (input) {
		case "oras":
			return "oras - 50";
		case "zona rezidentiala":
			return "zona rezidentiala - 30";
		case "drum express":
			return "drum express - 100";
		case "autostrada":
			return "autostrada - 130";
		default:
			return "This type of road does not exist!";
		}
	}

	public static void main(String[] args) {

		System.out.println("Introduce the type of city.");
		System.out.println(
				"Attention! You can only introduce these types: oras, zona rezidentiala, drum express, autostrada.");
		System.out.print("Your choice: ");

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		System.out.println("This is the output of the first method:");
		System.out.println(roadType1(input));

		System.out.println("This is the output of the second method:");
		System.out.println(roadType2(input));

		System.out.println("This is the output of the third method:");
		System.out.println(roadType3(input));

		scan.close();

		// System.out.println("This type of road does not exist!");

	}

}
