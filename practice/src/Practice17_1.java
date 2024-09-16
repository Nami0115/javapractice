public class Practice17_1 {
	String s = null;
	try {
		System.out.println(s.length());	
	} catch (NullPointerException e) {
		System.out.println("NullPointerException例外をcatchしました");
		System.out.println("--スタックトレース（ここから）--");
		printStackTrace();
		System.out.println("--スタックトレース（ここまで）--");
	}
}