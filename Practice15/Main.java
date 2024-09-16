package Practice15;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date d1 = new Date();
		
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int after = dayOfMonth + 100;
		c.set(Calendar.DAY_OF_MONTH, after);
		Date d2 = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年mm月dd日");
		String s = f.format(d2);
		
		System.out.println(s);		
	}
}