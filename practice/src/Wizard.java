public class Wizard {
	private int hp;
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
			throw new IllegalArgumentException ("HPが0未満だったため、0に再設定し、処理を中断");
		}
		
		this.hp = hp;
	}
	
	private int mp;
	
	public int getMp() {
		return this.mp;
	}
	
	public void setMp (int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException ("MPが0未満のため、処理を中断");
		}
		
		this.mp = mp;
	}
	
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException ("名前が短すぎるため、処理を中断。");
		}
		
		this.name = name;
	}	
	
	private Wand wand;
	
	public Wand wand() {
		return this.wand;
	}
	
	public void wand (Wand wand) {
		this.wand = wand;
	}
	
	void heal(Hero h) {
		private int basePoint = 10;
		
		public int getBasePoint() {
			return this.basePoint;
		}
		
		private int recovPoint = (int)(basePoint * this.wand.power);
		
		public int getRecovPoint() {
			return this.getRecovPoint;
		}
		
		public void setRecovPoint (int recovPoint) {
			if (wand.power <= 0) {
				throw new IllegalArgumentException ("杖を装備していないため、処理を中断。");
			}
			
			if (recovPoint < 0.5 && recovPoint > 100) {
				throw new IllegalArgumentException ("増幅率が設定範囲外のため、処理を中断。");				
			}
			
			this.recovPoint = recovPoint;
		}
		
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
}
