public class ArrayAssign {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		arr2[0] = 10;

		System.out.println("====numbers in arr1====");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("====numbers in arr2====");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}