package excercises;

import java.util.Scanner;

public class DistanceFromAverage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = new double[20];
		int quit = 0;
		double avg;
		Scanner input = new Scanner(System.in);
		
		
		
		while(quit != 99999)
		{
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			System.out.println("Please enter number >> " + "(" + (i + 1) + ")");
			avg = numbers[i] / i;
			System.out.println("Type 99999 to quit");
			quit = input.nextInt();
		}
		
	}
}
}
