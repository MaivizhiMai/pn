import java.util.Scanner;

public class Basic93 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Temperature to Convert from C to F");
		double d = s.nextDouble();
		System.out.println("Converted C to F : " + ((d * 1.8) + 32));

	}

}
