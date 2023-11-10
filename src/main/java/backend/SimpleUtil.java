package backend;

import java.time.LocalTime;

/**
 * Simple class to log a message with time format.
 * */
public class SimpleUtil {
	/* Simple loggers */
	/**
	 * Logs a simple message and its time of execution.
	 * */
	public static void log(String msg) {
		log(msg, "\n");
	}

	/**
	 * Logs a message with a defined end line.
	 * */
	public static void log(String msg, String endLine) {
		log(msg, endLine, null);
	}

	/**
	 * Logs a message, with its end line and location.
	 * @param msg The message to be sent.
	 * @param endLine A string that will be concatenated at the back of the actual message.
	 * @param caller The class that is assumed as this method's invoker, used to print the location of the log.
	 * */
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
