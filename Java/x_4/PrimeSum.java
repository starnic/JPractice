import java.util.Scanner;

/*
 * 给定两个整数n和m，0<n<=m<=200
 * 你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
 */

public class PrimeSum {

	public static void main(String[] args) {
		int cnt = 1;
		int[] prime = new int[200];
		prime[0] = 2;
		//求出前200个素数并放入prime数组中
		MAIN_LOOP: for (int x = 3; cnt < 200; x++) {
			for (int j = 0; j < cnt; j++) {
				if (x % prime[j] == 0) {
					continue MAIN_LOOP;
				}
			}
			prime[cnt++] = x;
		}
		
		//读入两个数
		Scanner in = new Scanner(System.in);	
		int a = in.nextInt();
		int b = in.nextInt();
		
		int sum = 0;
		//求出两个数之间的素数作为下标求和
		for (int i = a-1; i <= b-1; i++) {
			sum += prime[i];
		}
		System.out.println(sum);
	}
	
}