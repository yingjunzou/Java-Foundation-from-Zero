public class Homework01 {
	public static void main (String[] args) {
		A01 a01 = new A01();
		double[] arr = {1.0, 4.7, 1.8};
		Double res = a01.max(arr);
		if(res != null) {
			System.out.println("The maximum component in arr = " + res);
		} else {
			System.out.println("The input of arr has error, arr cannot be null or {}.");
		}
	}
}

class A01 {
	public Double max(double[] arr) {

		if(arr != null && arr.length > 0) {
			//make sure there is at least one component in arr
			double max = arr[0];//assume the 1st element is the maximum value
			for(int i = 1; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
			return max;//double
		} else {
			return null;
		}
	}
}