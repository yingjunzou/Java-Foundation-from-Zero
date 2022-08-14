public class OverLoadExercise {
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(10);
		method.m(10, 20);
		method.m("Han Shunping Education hello");

		System.out.println(method.max(10, 24));
		System.out.println(method.max(10.0, 21.4));
		System.out.println(method.max(10.0, 1.4, 30));
	}
}

class Methods {
	public void m(int n) {
		System.out.println("square = " + (n * n));
    }
	public void m(int n1, int n2) {
		System.out.println("product = " + (n1 * n2));
    }
	public void m(String str) {
		System.out.println("transferred str = " + str);
    }
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2, double n3) {
		System.out.println("max(double n1, double n2, double n3)");
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
	public double max(double n1, double n2, int n3) {
		System.out.println("max(double n1, double n2, int n3)");
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
}