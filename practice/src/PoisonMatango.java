//問題を解いた後に解答ページを確認していますが、あえて解答内容を修正せずに提出していますので、
//次回のレッスンの時に細かい部分のご指導をお願いします。

public class PoisonMatango extends Matango {
	int poison;
	
	public PoisonMatango(int poison) {
		poison = 5;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
		
		if (poison > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			h.hp -= h.hp/5;
			System.out.println(h.hp + "ポイントのダメージ！");
			poison -= 1;
		}
	}
}
