public class MethodParameter01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		AA obj = new AA();
		obj.swap(a, b);

		System.out.println("a = " + a + "b = " + b);
	}
}

class AA {
	public void swap(int a, int b) {
		System.out.println("\na and b before swap\na = " + a + "\tb = " + b);
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na and b after swap\na = " + a + "\tb = " + b);
	}
}