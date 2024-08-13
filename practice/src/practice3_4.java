public class practice3_4 {
	public static void main(String[] args) {
		boolean tenki = true;
		
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else {
			System.out.println("映画を見ます");
			System.out.println("寝ます");
		}
	}
}

/* ifの場合で表示される内容の後ろに、elseの場合に表示される内容も表示されてしまっている
 * elseの処理内容を囲む角カッコがなかったので、追加しました*/