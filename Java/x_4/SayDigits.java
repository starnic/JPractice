import java.util.Scanner;

/*
 * 读入一个整数，范围是[-100000,100000]。然后，用汉语拼音将这个整数的每一位输出出来。
 */
public class SayDigits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		StringBuffer nu = new StringBuffer();
		//把-123456789的拼音放入到spellArr数组中
		String[] spellArr = new String[] { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "fu" };
		int len = num.length();
		//创建一个新的数组arr
		String[] arr = new String[len];
		//判断输入的第一个字符是否是'-'
		if (String.valueOf(num.charAt(0)).equals("-")) {
			//如果是'-',就arr[0]置为10
			arr[0] = "10";
			//把输入的字符串存入arr数组中，下标从1开始了
			for (int i = 1; i < len; i++) {
				//把读入的数字字符串每一个字符取出来
				arr[i] = String.valueOf(num.charAt(i));

			}
		} else {
			//把输入的字符串存入arr数组中，下标从0开始
			for (int i = 0; i < len; i++) {
				arr[i] = String.valueOf(num.charAt(i));

			}
		}
		
		//利用arr数组中的数字把spellArr数组中的拼音写入Stringbuffer里
		for (int i = 0; i < len; i++) {
			//把arr数组的字符串元素转换为数字作为下标
			int inte = Integer.parseInt(arr[i]);
			if (i < len - 1) {
				//最后一位之前的拼音都需要在后面加空格
				nu.append(spellArr[inte] + " ");
			} else {
				//最后一位不需要
				nu.append(spellArr[inte]);
			}
		}

		System.out.println(nu);

	}

}
