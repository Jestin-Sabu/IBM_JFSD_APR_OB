public class ArrayDemo {
	public static void main(String[] args) {
		
		//simple for loop
		int [] arr = {10,20,30,40};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//for each
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Jagged array
		int [][] jag = {{1,2}, {3,4,5}, {6,7,8,9}};
		for (int[] row: jag) {
			for (int n:row) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
		
		//simple bubble sort
		int[] sort = {3,5,2,1,4};
		System.out.println("\nBefore sorting");
		for (int i : sort) {
			System.out.print(i + " ");
		}
		for (int i = 0; i < sort.length-1; i++) {
			for (int j = 0; j < sort.length-i-1; j++) {
				if(sort[j] > sort[j+1]) {
					int temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
				}
			}
		}
		System.out.println("\nAfter sorting");
		for (int i : sort) {
			System.out.print(i + " ");
		}

	}
}
