package momocorp;


	import java.util.Random;

	public class Dice implements java.io.Serializable {
		private int turn, score, d1, d2;
		private String name;
		Random r = new Random();


		public Boolean play() {
			if (turn < 10) {
				d1=r.nextInt(5)+1;
				d2=r.nextInt(5)+1;
				if (d1+d2==7) {
					score+=10;
				}
				turn++;
				return false;
			} else {
				return true;
			}
		}
		
		public String toString() {
			return "turn:"+turn+", d1:"+d1+",d2:"+d2+",score:"+score+",name:"+name;
		}

		public int getTurn() {
			return turn;
		}

		public void setTurn(int turn) {
			this.turn = turn;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public int getD1() {
			return d1;
		}

		public void setD1(int d1) {
			this.d1 = d1;
		}

		public int getD2() {
			return d2;
		}

		public void setD2(int d2) {
			this.d2 = d2;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
}
