package Java_8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeAPIDemo {
	public static void main(String[] args) {
		// LocalDate
		LocalDate date = LocalDate.of(2023, 9, 9);
		LocalDate futureDate = date.plusDays(7);
		LocalDate pastDate = date.minusDays(7);

		// LocalTime
		LocalTime time = LocalTime.of(15, 30);
		LocalTime futureTime = time.plusHours(2);
		LocalTime pastTime = time.minusMinutes(15);

		// LocalDateTime
		LocalDateTime dateTime = LocalDateTime.of(2023, 9, 9, 15, 30);
		LocalDateTime futureDateTime = dateTime.plusMonths(3);
		LocalDateTime pastDateTime = dateTime.minusHours(2);

		// ZonedDateTime
		ZonedDateTime zonedDateTime = ZonedDateTime.of(2023, 9, 9, 15, 30, 0, 0, ZoneId.of("America/New_York"));
		ZonedDateTime newYorkTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));

		// Duration
		Duration duration = Duration.ofDays(7);
		Duration extendedDuration = duration.plus(Duration.ofHours(3));
		Duration reducedDuration = duration.minus(Duration.ofMinutes(30));

		// Period
		Period period = Period.of(2, 6, 10);
		Period extendedPeriod = period.plus(Period.of(1, 3, 5));
		Period reducedPeriod = period.minus(Period.of(0, 2, 2));

		// Printing results
		System.out.println("LocalDate: " + date + ", Future: " + futureDate + ", Past: " + pastDate);
		System.out.println("LocalTime: " + time + ", Future: " + futureTime + ", Past: " + pastTime);
		System.out.println("LocalDateTime: " + dateTime + ", Future: " + futureDateTime + ", Past: " + pastDateTime);
		System.out.println("ZonedDateTime: " + zonedDateTime + ", New York Time: " + newYorkTime);
		System.out
				.println("Duration: " + duration + ", Extended: " + extendedDuration + ", Reduced: " + reducedDuration);
		System.out.println("Period: " + period + ", Extended: " + extendedPeriod + ", Reduced: " + reducedPeriod);
	}
}
