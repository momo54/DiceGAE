package momocorp;




import java.util.ArrayList;
import java.util.Iterator;

public class Hs {
	ArrayList<Score> scores=new ArrayList<Score>();
	
	public void add(String name, int score) {
		scores.add(new Score(score,name));
	}
	
	public String toString() {
		StringBuffer sb=new StringBuffer();
		for (Score score : scores) {
			sb.append(score+",");
		}
		return sb.toString();
	}
}
