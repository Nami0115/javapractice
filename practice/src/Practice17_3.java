public class Practice17_3 {
	public static void main(String[] args) {
		String s = ("三");
		try {
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("文字列の形式が正しくありません");
		}
	}
}