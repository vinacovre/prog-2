import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment_2 {
	public static void main(String[] args) {
		int x, y;
		Scanner in = new Scanner(System.in);
		System.out.println("Division of x by y");
		while (true) {
			try {
				System.out.print("Insert x: ");
				x = in.nextInt();
				System.out.print("Insert y: ");
				y = in.nextInt();
				System.out.println(x/y);
				break;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid input!");
			} catch (ArithmeticException ae) {
				System.out.println("y cannot be zero!");
			}
		}
		in.close();
	}
}
