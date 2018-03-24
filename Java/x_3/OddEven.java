import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inp = 0;
		int i = 0;
		int j = 0;
		while (true) {
			inp = in.nextInt();
			if(inp == -1){
				break;
			}
			if (inp % 2 == 0) {
				i += 1;
			}
			if (inp % 2 != 0) {
				j += 1;
			}
		}
		System.out.println(j + " " + i);
	}
}
