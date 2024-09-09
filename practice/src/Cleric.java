public class Cleric {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private int hp = 50;
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public static final int MAXHP = 50;
	
	private int mp = 10;
	
	public int getMp() {
		return this.mp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public static final int MAXMP = 10;
	
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