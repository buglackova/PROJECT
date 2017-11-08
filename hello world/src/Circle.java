import java.util.Scanner;

public class Circle extends Fig {
	public void showfig() {
		System.out.print("Circle with radius:");
	};

	public void input() {
		System.out.print("Type Circle radius: ");
		Scanner in = new Scanner(System.in);
	};
}
