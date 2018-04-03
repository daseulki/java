package mail1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Mail1 {

	public static int[] mail1() {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int i=0;
		
		while (sc.hasNextLine()) {
			num[i] = sc.nextInt();
			i++;	
		}
		
		return num;
	}
	public static int findnum(int[] num) {
		int min = 1;
		Arrays.sort(num);
		
		for (int i = 0 ; i < num.length ; i++) {
			if(num[i] != 1 ) {
				return 1;
			} 
			else if(num[i] == min){
				min ++;
			} 
			else if(num[i] != min ) {
				return min;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println(findnum(mail1()));
	}

}
