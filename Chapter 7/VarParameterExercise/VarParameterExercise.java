public class VarParameterExercise {
	public static void main(String[] args) {
		HspMethod hm = new HspMethod();
		System.out.println(hm.showScore("milan" , 90.1, 80.0));
		System.out.println(hm.showScore("terry" , 90.1, 80.0, 10, 30.5, 78));
	};
}

class HspMethod {
	public String showScore(String name, double... scores) {

		double totalScore = 0;
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + " has " + scores.length + " classes' total score = " + totalScore;
	}
}