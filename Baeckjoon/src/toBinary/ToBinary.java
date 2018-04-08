package toBinary;
import java.util.Scanner;

public class ToBinary {

	public static void binary() {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();

		/*int n = input.length(); //ÀÚ¸®¼ö
		if(n>333334) {
			return;
		}
		char[] num = new char[n];
		String[] binary = new String[n];*/
		
		char[] num = input.toCharArray();
		StringBuilder a = new StringBuilder();
		
		
		for(int i = 1 ; i<num.length ; i++) {
		
			if (num[i] == '0') a.append("000");
			else if (num[i] == '1') a.append("001");
			else if (num[i] == '2') a.append("010");
			else if (num[i] == '3') a.append("011");
			else if (num[i] == '4') a.append("100");
			else if (num[i] == '5') a.append("101");
			else if (num[i] == '6') a.append("110");
			else if (num[i] == '7') a.append("111");		
		}
		
		for(int i = 1 ; i<num.length ; i++) {			
			System.out.print(a.toString());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary();
	}

}
