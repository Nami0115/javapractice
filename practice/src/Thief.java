//重複部分を減らせるような気がするのですが、どうやればよいか分かりません
//練習問題9-2は、お手上げ状態になったので、解答を見ました

public class Thief {
	String name;
	int hp;
	int mp;
	
	public Thief(String name) {
		this.name = name;
		this.hp = 40;
		this.mp = 5;
	}
	
	public Thief(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.mp = 5;
	}
		
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
}
