public class Homework07 {
	public static void main(String[] args) {
		int[] arr = {20, -1, 89, 2, 890, 7};
		int temp = 0;

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.println("\n====after reverse====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}