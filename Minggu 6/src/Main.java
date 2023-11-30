import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		String message = "Welcome to Java!";
//		System.out.println(message.substring(0, 7));
		String nara = "Nara";


		Scanner in = new Scanner(System.in);

		System.out.print("Input your string: ");
		String original = in.nextLine();

		System.out.println("Original value				: " + original);
		System.out.println("Removed spaces at first/end	: " + original.trim());
		System.out.println("Removed double/more spaces	: " + original.trim().replaceAll(" {2,}", " "));
	}
}
