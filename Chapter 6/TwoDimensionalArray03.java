public class TwoDimensionalArray03 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];

			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
		}
		System.out.println("=====numbers in the array=====");

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}