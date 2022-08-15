public class Homework03 {
	public static void main (String[] args) {
		Book book = new Book("Xiao Ao Jiang Hu", 300);
		book.info();
		book.updatePrice();
		book.info();
	}
}
class Book {
	//Bulid up a constructor
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	//method
	public void updatePrice() {
		if(price > 150) {
			price = 150;
		} else if (price > 100) {
			price = 100;
		}
	}
	public void info() {
		System.out.println("Book name = " + this.name + " Price = " + this.price);
	}
}