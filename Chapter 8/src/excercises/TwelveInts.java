package excercises;

public class TwelveInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		String[] stringArray = {"This ", "is ", "a ", "string ", "array"};
		int total = 0;
		System.out.println("Print numbers from first to last");
		
		for(int i = 0; i < numArrays.length; i++) {
			System.out.println("Numbers in order " + numArrays[i]);
			total = total + i;
			}
			
			System.out.println("Print numbers from last to first");
			
			for(int j = 11; j >= 0; j--) {
				System.out.println("Numbers in reverse order " + numArrays[j]);
			}
			System.out.println("\nTotal : " + total);
			
			for(int z = 0; z < stringArray.length; z++) {
				System.out.print(stringArray[z]);
		}
	}
}

