public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = MAXHP;
	}
	
	public int pray (int sec) {
		int correction = new java.util. Random().nextInt(3);
		int recovered = sec + correction;
		if (recovered > MAXMP) {
			recovered = MAXMP;
		}
		return recovered;
	}
}