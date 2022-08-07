import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {
		double[] scores = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.println("Please input value of Number" + (i+1));
			scores[i] = myScanner.nextDouble();
		}
		System.out.println("==The numbers of array are shown below: ===");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("The value of Number " + (i+1) + " is" + scores[i]);
		}
	}
}