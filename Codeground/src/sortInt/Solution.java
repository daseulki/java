package sortInt;
/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;
import java.util.Arrays;
/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();

		for(int test_case = 0; test_case < T; test_case++) {
		
		    int num = sc.nextInt();
			int arr[] = new int[num];
			
		    for (int i = 0 ; i<num ; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(arr);
			int Answer = 0;
			
		    for (int i = 0 ; i<num ; i++){  
		    	
		    	System.out.print(arr[i]);
		    	
		        if(i%2==1) {
		        	Answer -= arr[i];
		        }
		        else Answer += arr[i];
	
		    }
		    
		    
			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}