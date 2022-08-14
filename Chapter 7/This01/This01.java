public class This01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Da Zhuang", 3);
		System.out.println("dog1's hashcode = " + dog1.hashCode());
		//dog1.info();
		Dog dog2 = new Dog("Da Huang", 2);
		System.out.println("dog2's hashcode = " + dog2.hashCode());
		//dog2.info();
	}
}

class Dog {
	String name;
	int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("this.hashCode = " + this.hashCode());
	}
}