package AAA;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class date {

	public static void main(String[] args) throws ParseException {

		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();

		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDate pastWeekDate = d04.minusDays(7);
		LocalDate nextWeekDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDate = d05.minusDays(7);
		LocalDateTime nextWeekLocalDate = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDate, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());

		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());

		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));

		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());
		
		
		
		LocalDate d4 = LocalDate.parse("2022-07-02");
		LocalDateTime d5 = LocalDateTime.parse("2022-07-02T01:30:26");
		Instant d6 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d7 = Instant.parse("2022-07-20T01:30:26-03:00");
		LocalDate d8 = LocalDate.parse("20/07/2022", f1);
		LocalDateTime d9 = LocalDateTime.parse("20/07/2022 01:30", f2);
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4.format(f1));
		System.out.println(d5.format(f2));
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);	
		System.out.println(d11);
		
		
		 SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
		 SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyyHH:mm:ss");
		 SimpleDateFormat sdf3= new SimpleDateFormat("dd/MM/yyyyHH:mm:ss");
		 sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		 Date x1= new Date();
		 Date x2= new Date(System.currentTimeMillis());
		 Date x3= new Date(0L);
		 Date x4= new Date(1000L * 60L * 60L * 5L);
		 Date y1= sdf1.parse("25/06/2018");
		 Date y2= sdf2.parse("25/06/2018 15:42:07");
		 Date y3= Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		 System.out.println("x1: "+ x1);
		 System.out.println("x2: "+ x2);
		 System.out.println("x3: "+ x3);
		 System.out.println("x4: "+ x4);
		 System.out.println("y1: "+ y1);
		 System.out.println("y2: "+ y2);
		 System.out.println("y3: "+ y3);
		 System.out.println("-------------");
		 System.out.println("x1: "+ sdf2.format(x1));
		 System.out.println("x2: "+ sdf2.format(x2));
		 System.out.println("x3: "+ sdf2.format(x3));
		 System.out.println("x4: "+ sdf2.format(x4));
		 System.out.println("y1: "+ sdf2.format(y1));
		 System.out.println("y2: "+ sdf2.format(y2));
		 System.out.println("y3: "+ sdf2.format(y3));
		 System.out.println("-------------");
		 System.out.println("x1: "+ sdf3.format(x1));
		 System.out.println("x2: "+ sdf3.format(x2));
		 System.out.println("x3: "+ sdf3.format(x3));
		 System.out.println("x4: "+ sdf3.format(x4));
		 System.out.println("y1: "+ sdf3.format(y1));
		 System.out.println("y2: "+ sdf3.format(y2));
		 
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 Date dd = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(dd);
		 cal.add(Calendar.HOUR_OF_DAY, 4);
		 dd = cal.getTime();
		 System.out.println(sdf.format(dd));
	}

}
