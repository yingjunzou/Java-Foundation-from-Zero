import java.util.Random;
import java.util.Scanner;

public class MoraGame {
	public static void main (String[] args) {
		Tom t = new Tom();
		int isWinCount = 0;

		int[][] arr1 = new int[3][3];
		int j = 0;

		String[] arr2 = new String[3];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {

			System.out.println("Please input your selection (0-Stone, 1-Scissors, 2-Cloth): ");
			int num = scanner.nextInt();
			t.setTomGuessNum(num);
			int tomGuess = t.getTomGuessNum();
            arr1[i][j + 1] = tomGuess;

            int comGuess = t.computerNum();
            arr1[i][j + 2] = comGuess;

            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;

            System.out.println("==============================================");
            System.out.println("Number of games\tPlay's seclection\tComputer's selection\tWin/Lose");
            System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + t.vsComputer());
            System.out.println("==============================================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
		}

		    System.out.println("Number of games\tPlay's seclection\tComputer's selection\tWin/Lose");
		    for (int a = 0; a < arr1.length; a++) {
		    	for(int b = 0; b < arr1[a].length; b++) {
		    		System.out.print(arr1[a][b] + "\t\t\t");
		    	}
		    	System.out.print(arr2[a]);
		    	System.out.println();
		    }
		    System.out.println("You won " + isWinCount + " times");
	}
}

class Tom {
	int tomGuessNum;
	int comGuessNum;
	int winCountNum;
	int count = 1;

	public void showInfo() {

	}
    /**
     * The method how computer generate random numers
	 * @return
	 */
    public int computerNum() {
    	Random r = new Random();
    	comGuessNum = r.nextInt(3);
    	return comGuessNum;
    }

    /**
     * Set up method for player to input numbers
     * @param tomGuessNum
     */
    public void setTomGuessNum(int tomGuessNum) {
    	if (tomGuessNum > 2 || tomGuessNum < 0) {
    		throw new IllegalArgumentException("Input of numers has error");
    	}
    	this.tomGuessNum = tomGuessNum;
    }

    public int getTomGuessNum() {
    	return tomGuessNum;
    }
    /**
     * Compare the results
     * @return Return true if player win, otherwise return false
     */
    public String vsComputer() {
    	if(tomGuessNum == 0 && comGuessNum == 1) {
    		return "You won";
    	} else if (tomGuessNum == 1 && comGuessNum == 2) {
    		return "You won";
    	} else if (tomGuessNum == 2 && comGuessNum == 0) {
    		return "You won";
    	} else if (tomGuessNum == comGuessNum) {
    		return "It's a tie.";
    	}else {
    		return "You lose";
    	}
    }

    /**
     * Record the numbers of plays
     * @return
     */
    public int winCount(String s) {
    	count++;
    	if(s.equals("You won")) {
    		winCountNum++;
    	}
    	return winCountNum;
    }
}