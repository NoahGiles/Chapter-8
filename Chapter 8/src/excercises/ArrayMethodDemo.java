package excercises;


public class ArrayMethodDemo {
	
	public static void main(String[] args) {
	int a = 0;
	int b = 0;
	int c = 0;
	int[] array = {12, 3, 4, 6, 98, 100, 10, 345, 67, 98};
	
	PositiveOrder(array, a);
	ReverseOrder(array, b);

	
	}
	public static void PositiveOrder(int[] array, int a) {
		int total = 0;
		System.out.println("In positive order : \n");
		for(a = 0; a < array.length; a++) {
			System.out.println(array[a]);
			total = total + array[a];
	}
		System.out.println("");
		Sum(total);
		System.out.println("");
	}
	
	public static void ReverseOrder(int[] array, int b) {
		System.out.println("In reverse order : \n");
	for(b = 9; b >= 0; b--) {
		System.out.println(array[b]);}	
	}
	public static void Sum(int c) {
	
	System.out.println("Total of : " + c);
		
	}
}



