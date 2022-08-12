public class RecursionExercise01 {
	public static void main(String[] args) {
		T t1 = new T();
		// int n = 7;
		// int res = t1.fibonacci(n);
		// if(res != -1) {
		// 	System.out.println("n = " + n + ", fibonacci = " + res);
		// }

		//peach problem
		int day = 1;
		int peachNum = t1.peach(day);
		if(peachNum != 1) {
			System.out.println("Day " + day + " has " + peachNum + " peaches");
		}
	}
}

class T {
	// public int fibonacci(int n) {
	// 	if(n >= 1) {
	// 		if(n == 1 || n == 2) {
	// 			return 1;
	// 		} else {
	// 			return fibonacci(n - 1) + fibonacci(n - 2);
	// 		}
	// 	} else {
	// 		System.out.println("The input integer needs to satisfy n >= 1");
	// 		return -1;
	// 	}
	// }

	public int peach(int day) {
		if(day == 10) {
			return 1;
		} else if (day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day is between 1 - 10");
			return -1;
		}
	}

}