package backend;

import java.time.LocalTime;

/**
 * Simple class to log a message with time format.
 * */
public class SimpleUtil {

	/* Simple loggers */

	public static void log(String msg) {
		log(msg, "\n");
	}

	public static void log(String msg, String endLine) {
		log(msg, endLine, null);
	}

	public static void log(String msg, String endLine, Object caller) {
		final var time = LocalTime.now();
		if (caller == null) {
			System.out.printf("%02d:%02d:%02d | LOG: " + msg + endLine,
				time.getHour(), time.getMinute(), time.getSecond());
		} else {
			System.out.printf("@ " + caller.getClass().getName() + "| %02d:%02d:%02d | LOG: " + msg + endLine,
				time.getHour(), time.getMinute(), time.getSecond());
		}
	}
}
