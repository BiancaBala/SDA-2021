package Laborator1;

import java.util.Scanner;

public class TemaLab1 {

	public static void main(String[] args) {
		
		int firstNo, secondNo, sum, difference, product, max, min, distance;
		float average;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input 1st integer: ");
		firstNo = scan.nextInt();
		
		System.out.print("Input 2nd integer: ");
		secondNo = scan.nextInt();
		
		sum = firstNo + secondNo;
		
		difference = firstNo - secondNo;
		
		product = firstNo * secondNo;
		
		average = (float) ((firstNo + secondNo)/2.0);
		
		if(firstNo > secondNo) {
		
			max = firstNo;
			min = secondNo;
		}
		else {
			
			max = secondNo;
			min = firstNo;
		}
		
		if(firstNo > secondNo) {
			
			distance = firstNo - secondNo;
		}
		else {
			
			distance = secondNo - firstNo;
			
		}
		
		 System.out.println("Sum of two integers: " + sum);
		 
		 System.out.println("Difference of two integers: " + difference);
		 
		 System.out.println("Product of two integers: " + product);
		 
		 System.out.println("Average of two integers: " + average);
		 
		 System.out.println("Distance of two integers: " + distance);
		 
		 System.out.println("Maximum of integers: " + max);
		 
		 System.out.println("Minimum of integers: " + min);
		 
		 scan.close();

	}

}
