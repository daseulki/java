package escapeFire;

import java.util.Scanner;

public class Main {

	//������ ���� ���� �ʴ´�. 
	//����̴� �������� ������ ĭ���� �̵��� �� ������, 1�ʰ� �ɸ���.  
	//���� �Ű��� ĭ �Ǵ� ���� ���� �������� ĭ���� �̵��� �� ����. 
	/* ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �׽�Ʈ ���̽��� �ִ� 100���̴�.

�� �׽�Ʈ ���̽��� ù° �ٿ��� ���� ������ �ʺ�� ���� w�� h�� �־�����. (1 �� w,h �� 1000)

���� h�� �ٿ��� w���� ����, ������ ������ �־�����.

'.': �� ����
'#': ��
'@': ������� ���� ��ġ
'*': �� */
	public static void makeMap() {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			int w = sc.nextInt();
			int h= sc.nextInt();
			
			String[][] map = new String[w][h];
						
			for (int i = 0 ; i<w ; i++) {
				for(int j = 0 ; j<h ; j++) {
					map[i][j] = sc.next();
				}
			}
			
		}
	}
	
}

