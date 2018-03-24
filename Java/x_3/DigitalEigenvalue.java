import java.util.Scanner;

public class DigitalEigenvalue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0; 
		int binary = 0;
		int a;
		do {
			a = number % 10;
			if ((a % 2 == 0 && (count + 1) % 2 == 0) || (a % 2 != 0 && (count + 1) % 2 != 0)) {
				binary = binary + (int) (Math.pow(2, count));
			}
			number = number / 10;
			count += 1;
		} while (number != 0);
		System.out.println(binary);
		in.close();

	}

}
