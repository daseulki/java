// Ã¶ÀÚÀÇ °¹¼ö¸¦ ºñ±³.. 
package anagram;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

	public static int[] count(String word) {
		
		int arr[] = new int[26];
		
		for(int i=0;i<word.length();i++) {
			arr[word.charAt(i) - 'a']++;
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string");
		String first = sc.nextLine();
		
		System.out.println("Enter second string");
		String second = sc.nextLine();
				
		if(Arrays.equals(count(first),count(second))) {
			System.out.println("\""+first + "\" and \"" +second +"\" are anagrams." );
		}
		else {
			System.out.println("\""+first + "\" and \"" +second +"\" are not anagrams." );
		}				
	}
}
