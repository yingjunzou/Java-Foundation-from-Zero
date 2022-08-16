public class Homework09 {
	public static void main (String[] args) {
		Music music = new Music("Xiao Ao Jiang Hu", 300);
		music.play();
		System.out.println(music.getInfo());
	}
}

class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	public void play() {
		System.out.println("Music " + name + " is playing... The time length is " + 
			times + " seconds.");
	}
	public String getInfo() {
		return "Music " + name + "'s play time is " + times;
	}
}