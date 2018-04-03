package mail2;

import java.util.Scanner;
import java.util.Arrays;

public class Mail2 {
	int cnt = 0;
	public static void input() {
		int[][] arr = new int[5][5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<5 ; i++) {
			for (int j = 0 ; j<5 ; j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}	
	}
	
	public void findNemo(int[][] arr) {
		//1로 이루ㅜ어진 가장 큰 사각형 찾기 
		// 사각형이 무엇이냐 사각형 x*x 
		//빈 배열 만들어서 한줄씩 체크 윗줄과 같은지 체크 계속 
		int[][] check = new int [5][5];
		int h, v, tmp;
		int i = 0;
		int j = 0;
		while (i<5 || j<5) {
			if (arr[i][j] == 1) { //arr에 1이 연속으로 나오는 부분을 찾아라 
				if(arr[i+1][j] == 1 && arr[i][j+1] == 1) {
					// [i+1][j],[i][j+1] 도 1 인지 확인. 아니면 cnt = 0; i+1 or j+1>=5 면 탈출 
					// i+1이 i와 같은지 확인 같으면 cnt = cnt + cnt; 같지 않으면 cnt 유지 	
					cnt ++; 
				}
			}
			else {
				j++;
			}	
		}

	}
}
