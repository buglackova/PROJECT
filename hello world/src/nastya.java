import java.util.Scanner;

public class nastya {

	public static void main(String[] args) {

		int k = 0, n = 0, g = 0;
		Fig[] arra = new Fig[30];
		Fig h;
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out
					.println("\n0-exit; 1-add circle; 2-add sqare; 3-add triangle; 4-show all figures; 5-change figure: ; 6-delete last figure");
			k = in.nextInt();

			switch (k) { 
			case 1: {
				arra[n] = new Circle();
				arra[n].input();
				n++;
				break;
			}
			case 2: {
				arra[n] = new Square();
				arra[n].input();
				n++;
				break;
			}
			case 3: {
				arra[n] = new Triangle();
				arra[n].input();
				n++;
				break;
			}
			case 4: {
				for (int i = 0; i < n; i++) {
					System.out.println("\nFigure: ");
					System.out.print(i);
					arra[i].showfig();
				}
				break;
			}
			case 5: {
				System.out.println("Set figure number to change: ");
				g = in.nextInt();
				if (g < 0 || g >= n) {
					System.out.println("Wrong figure index!");
				} else {
					arra[g].change();
				}
				break;
			}
			case 6: {
				if (n > 0) {
					n--;
					// arra = ArrayUtils.removeElement(arra, arra[n]);
				} else {
					System.out.println("CANT FIND ANY FIGURE!");
				}
				break;
			}
			case 0:
				// return null;
			}
		}
	}
}
