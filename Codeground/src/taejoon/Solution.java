package taejoon;

import java.util.Scanner;
class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			// �Ÿ� = �ӷ� * �ð� 
			// 1�и��� +a -b �б�� �Ÿ� d 1<=b < a <= d <= 10^9
			// �б����� �ɸ��� �ð� ���ϱ� 
			Answer = 0;
			
			int a = sc.nextInt();
			int b= sc.nextInt();
			int d = sc.nextInt();
			
			int taejoon =0 ;
			
			for (int t = 1 ; ;t++) {			
				taejoon = taejoon + a;
				if (taejoon >= d) {
					Answer = t;
					break;
				}
				taejoon = taejoon -b;
			}
			
			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}