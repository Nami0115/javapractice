public class Practice15_1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i + ",");
		}
		String s = sb.toString();
		
		String[] numbers = s.split(",");
		for (String a : numbers) {
			System.out.println(a);
		}	
	}
}
