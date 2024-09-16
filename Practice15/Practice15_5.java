package Practice15;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice15_5 {
	public static void main(String[] args) {
		LocalDate l1 = LocalDate.now();
		LocalDate l2 = l1.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年mm月dd日");
		String s = l2.format(fmt);
		System.out.println(s);
	}
}