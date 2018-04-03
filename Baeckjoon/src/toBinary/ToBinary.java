package toBinary;
import java.util.Scanner;

public class ToBinary {

	public static void binary() {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int temp = input;
		int n = 0; //자리수
		
		while(temp != 0) {
			n++;
			temp /= 10;
			if (n>333334) {
				System.out.print("너무 큰 값이 입력되었습니다.");
				break;
			}
		}//n구하기

		int[] num = new int[n];
		String[] binary = new String[n];
		
		for(int i = num.length-1 ; i>=0 ; i--) {
			num[i] = input%10;
			input /= 10;
		}

		for(int i = 0 ; i<num.length ; i++) {
		
			if (num[i] == 0) binary[i] = "000";
			else if (num[i] == 1) binary[i] = "001";
			else if (num[i] == 2) binary[i] = "010";
			else if (num[i] == 3) binary[i] = "011";
			else if (num[i] == 4) binary[i] = "100";
			else if (num[i] == 5) binary[i] = "101";
			else if (num[i] == 6) binary[i] = "110";
			else if (num[i] == 7) binary[i] = "111";
		
		}
		
		if(binary[0] == "001") System.out.print(1);
		else if(binary[0] == "010") System.out.print(10);
		else if(binary[0] == "011") System.out.print(11);
		
		for(int i = 1 ; i<binary.length ; i++) {			
			System.out.print(binary[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary();
	}

}
