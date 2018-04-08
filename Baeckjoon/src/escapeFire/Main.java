package escapeFire;

import java.util.Scanner;

public class Main {

	//벽에는 불이 붙지 않는다. 
	//상근이는 동서남북 인접한 칸으로 이동할 수 있으며, 1초가 걸린다.  
	//불이 옮겨진 칸 또는 이제 불이 붙으려는 칸으로 이동할 수 없다. 
	/* 첫째 줄에 테스트 케이스의 개수가 주어진다. 테스트 케이스는 최대 100개이다.

각 테스트 케이스의 첫째 줄에는 빌딩 지도의 너비와 높이 w와 h가 주어진다. (1 ≤ w,h ≤ 1000)

다음 h개 줄에는 w개의 문자, 빌딩의 지도가 주어진다.

'.': 빈 공간
'#': 벽
'@': 상근이의 시작 위치
'*': 불 */
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

