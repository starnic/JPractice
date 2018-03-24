import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.nextLine();
		int a =time.length();
		switch(a) {
		case 1:	
			String aaa  = (24-8) +"0" + time;
			System.out.println(aaa);
			break;
		case 2:
			String aa  = (24-8) + time;
			System.out.println(aa);
			break;
			
		case 3:
			int at = (Integer.valueOf(time))/100;
			int ab;
			String as;
			if(at > 8) {
				 ab = at-8;
				 as  = ab + time.substring(1,3);
			}else if(at <8) {
				 ab = at-8+24;
				 as  = ab + time.substring(1,3);
			}else {
				if(time.substring(1,3).equals( "00")) {
					as ="0";
				}else if(time.substring(1,2).equals( "0")){
					as = time.substring(2,3);
				}else {
					as =  time.substring(1,3);
				}
			}
			System.out.println(as);	
			break;
			
		case 4:
			int t = (Integer.valueOf(time))/100;
			int b = t-8;
			String s  = b + time.substring(2,4);
			System.out.println(s);	
			break;
		}
		
	}
}
