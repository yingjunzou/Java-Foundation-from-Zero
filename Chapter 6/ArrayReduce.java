import java.util.Scanner;
public class ArrayReduce {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};

		do {
			int[] arrNew = new int[arr.length - 1];
			for(int i = 0; i < arrNew.length; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;

			System.out.println("====numbers in array after reducing the number====");
			for(int i = 0; i < arrNew.length; i++) {
				System.out.print(arr[i] + "\t");
			}

			if(arr.length < 2) {
				System.out.println("The numbers in the array is one, cannot remove any number");
				break;
			}
			System.out.print("Whether to continue to remove numbers: y/n ");
			char key = myScanner.next().charAt(0);
			if(key == 'n') {
				break;
			}
		} while (true);
	}
}