package momocorp;


public class Score {
	private int score;
	private String name;
	public Score(int score, String name) {
		super();
		this.score = score;
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public String toString() {
		return "name:"+name+",score:"+score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
