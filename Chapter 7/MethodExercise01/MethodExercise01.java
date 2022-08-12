public class MethodExercise01 {
	public static void main(String[] args) {
		AA a = new AA();
		if(a.isOdd(1)) {
			System.out.println("is odd");
		} else {
			System.out.println("is even");
		}

		a.print(4, 4, '#');
	}
}

class AA {
	public boolean isOdd(int num) {
		return num % 2 != 0;
	}

	public void print(int row, int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}