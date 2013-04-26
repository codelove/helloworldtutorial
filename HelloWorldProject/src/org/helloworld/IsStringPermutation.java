package org.helloworld;

import java.util.HashMap;

public class IsStringPermutation {
	public static boolean anagram(String str1, String str2) {
		
		if ( str1.length() != str2.length() )
			return false;
		
		int [] counts = new int[256];
		
		char [] cstr1 = str1.toCharArray();
		
		for ( char c: cstr1 )
			counts[c]++;
		
		char [] cstr2 = str2.toCharArray();

		for ( char c: cstr2 ) {
			counts[c]--;
			
			if ( counts[c] < 0 )
				return false;
		}
			
		return true;
	}


	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "orange";
		String str3 = "pepla";
		
		if ( anagram(str1, str2) ) {
			System.out.println(str1 + " is a permutation of " + str2);
		}
		else {
			System.out.println(str1 + " is not a permutation of " + str2);
		}
		
		if ( anagram(str1, str3) ) {
			System.out.println(str1 + " is a permutation of " + str3);
		}
		else {
			System.out.println(str1 + " is not a permutation of " + str3);
		}

	}

}
