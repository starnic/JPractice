import java.util.Scanner;

public class SignalReport {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int aa = a%10;
		int ab = a/10;
		String a1 = "";
        String a2 = "";
		switch (aa) {
		case 1:
			a1 = "Faint signals, barely perceptible, ";
			break;
		case 2:
			a1 = "Very weak signals, ";
			break;
		case 3:
			a1 = "Weak signals, ";
			break;
		case 4:
			a1 = "Fair signals, ";
			break;
		case 5:
			a1 = "Fairly good signals, ";
			break;
		case 6:
			a1 = "Good signals, ";
			break;
		case 7:
			a1 = "Moderately strong signals, ";
			break;
		case 8:
			a1 = "Strong signals, ";
			break;
		case 9:
			a1 = "Extremely strong signals, ";
			break;
		}
		
		switch (ab) {
		case 1:
			a2 = "unreadable.";
			break;
		case 2:
			a2 = "barely readable, occasional words distinguishable.";
			break;
		case 3:
			a2 = "readable with considerable difficulty.";
			break;
		case 4:
			a2 = "readable with practically no difficulty.";
			break;
		case 5:
			a2 = "perfectly readable.";
			break;
			default:
				ab = 0;
		}
		System.out.print(a1 + a2);
	}
}
