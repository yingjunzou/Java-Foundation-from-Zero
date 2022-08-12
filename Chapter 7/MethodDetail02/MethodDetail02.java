public class MethodDetail02 {
	public static void main(String[] args) {
		A a = new A();
		a.sayOK();
		a.m1();
	}
}

class A {
	public void print(int n) {
		System.out.println("print() was invoked n = " + n);
	}

	public void sayOK() {
		print(10);
		System.out.println("continue to execute sayOK()~~~");
	}

	public void m1() {
		System.out.println("m1() is was invoked");
		B b = new B();
		b.hi();

		System.out.println("m1() continue to be executed :)");
	}
}

class B {
	public void hi() {
		System.out.println("hi() in class B is to be executed");
	}
}