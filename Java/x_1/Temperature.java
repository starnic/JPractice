import java.util.Scanner;
class Temperature {
	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
                int f = in.nextInt();
		double c =((f-32)/(9/5.0));
		System.out.print((int)c);
	}
}
