package Laborator2;

import java.util.*;

public class P2_repet_instr {

	public static void main(String[] args) {

		double tempArray[] = { 36.3, 36.5, 36.9, 37.1, 38.5 };
		List<PacientTemp> anormalTemp = new ArrayList<>();
		List<PacientTemp> normalTemp = new ArrayList<>();

		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i] < 37.0)
				normalTemp.add(new PacientTemp(i, tempArray[i]));
			else
				anormalTemp.add(new PacientTemp(i, tempArray[i]));

		}

		System.out.println("Normal temperature: ");
		for (PacientTemp pacient : normalTemp) {
			System.out.print("(" + pacient.temp + ", " + pacient.id + ") ");

		}
		System.out.println();

		System.out.println("Anormal temperature: ");
		for (PacientTemp pacient : anormalTemp) {
			System.out.print("(" + pacient.temp + ", " + pacient.id + ") ");

		}
		System.out.println();
	}

}
