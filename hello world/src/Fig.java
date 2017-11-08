import java.util.Scanner;

/**
 * Created by Nastya on 08.11.2017.
 */

public class Fig {

	public int c;

	public void showfig() {
		System.out.print("Figure side " + c);
	}

	public void input() {
        System.out.print("Type Figure side ");
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
	}

	public void change() {
		System.out.print("Change Type Figure side ");
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
	}

}
