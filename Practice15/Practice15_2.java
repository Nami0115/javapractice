public class Practice15_2 {
	public static void main(String[] args) {
		String f = folder;
		if (f.endsWith("¥")) {
			f.replaceAll("¥$", "");		
		}
		
		System.out.println(f + "¥" + file);
	}
}