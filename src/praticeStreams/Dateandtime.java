package praticeStreams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Dateandtime {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		//LocalDate c= LocalDate.of(2010, 12, 12);
		LocalTime c= LocalTime.now();
		LocalTime t= LocalTime.now(ZoneId.of("Asia/Kuwait"));
		LocalDateTime u=LocalDateTime.now();
		System.out.println(d);
		System.out.println(c);
		System.out.println(t);
		System.out.println(u);

	}

}
