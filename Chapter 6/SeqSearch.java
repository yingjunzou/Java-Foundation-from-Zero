import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {
		String[] names = {"BaiMeiYingWang", "JinMaoShiWang", "ZiShanLongWang", "QingYiFuWang"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please input the name");
		String findName = myScanner.next();

		int index = -1;
		for(int i = 0; i < names.length; i++) {
			if(findName.equals(names[i])) {
				System.out.println("Congratulations! You find out " + findName);
				System.out.println("The index = " + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Sorry, cannot find " + findName);
		}
	}
}