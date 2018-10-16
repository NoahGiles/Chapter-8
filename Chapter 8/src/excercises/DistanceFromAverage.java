package excercises;

import java.util.Scanner;

public class DistanceFromAverage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = new double[20];
		Scanner input = new Scanner(System.in);
		int quit = 0;
		double avg = 0;
		double total = 0;
		double distance = 0;
		int i = 0;
		
		System.out.println("Insert a set of 20 numbers.");
		
	while(quit != 99999) {
		
			System.out.println("Please enter number >> ");
			numbers[i] = input.nextDouble();
			
			System.out.println("Type 99999 to quit");
			quit = input.nextInt();
			total = total + numbers[i];	
			avg = total / numbers.length;
			distance = avg - numbers[i];
			i++;
			
		}	

	System.out.println("Total : " + total);
	System.out.println("Average : " + avg);
	System.out.println("Distance from average : " + distance);	
	
	}
}

