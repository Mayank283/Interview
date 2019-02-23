package language.java.concepts;

/*import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;*/

public class StringFormater {

	public static void main(String[] args) {
		String id = "1";
		String s = String.format("%05d", Integer.parseInt(id));
		System.out.println(s);
		System.out.printf("%10s",id);
		/*Calendar c = new GregorianCalendar(2015,7,21);
		String s1 = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,Locale.US);
		System.out.println(s1.toUpperCase());*/
	}
}