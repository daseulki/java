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
		//1�� �̷�̾��� ���� ū �簢�� ã�� 
		// �簢���� �����̳� �簢�� x*x 
		//�� �迭 ���� ���پ� üũ ���ٰ� ������ üũ ��� 
		int[][] check = new int [5][5];
		int h, v, tmp;
		int i = 0;
		int j = 0;
		while (i<5 || j<5) {
			if (arr[i][j] == 1) { //arr�� 1�� �������� ������ �κ��� ã�ƶ� 
				if(arr[i+1][j] == 1 && arr[i][j+1] == 1) {
					// [i+1][j],[i][j+1] �� 1 ���� Ȯ��. �ƴϸ� cnt = 0; i+1 or j+1>=5 �� Ż�� 
					// i+1�� i�� ������ Ȯ�� ������ cnt = cnt + cnt; ���� ������ cnt ���� 	
					cnt ++; 
				}
			}
			else {
				j++;
			}	
		}

	}
}
