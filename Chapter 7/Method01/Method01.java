public class Method01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(5);
		p1.cal02(10);

		int returnRes = p1.getSum(10, 20);
		System.out.println("getSum method return = " + returnRes);
	}
}

class Person {
	String name;
	int age;

	public void speak() {
		System.out.println("I am a nice person.");
	}

	public void cal01() {
		int res = 0;
		for(int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("Result = " + res);
	}

	public void cal02(int n) {
		int res = 0;
		for(int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02 method Result = " + res);
	}

	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}