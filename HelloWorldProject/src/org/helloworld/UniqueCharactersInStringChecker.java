package org.helloworld;

public class UniqueCharactersInStringChecker {
	public static boolean unique(String string)
	{
		for ( int i = 0; i < string.length() - 1; ++i) {
			char first = string.charAt(i);
			
			for ( int j = i + 1; j < string.length(); ++j)
			{
				char second = string.charAt(j);
				
				if ( first == second )
					return false;
			}
		}
		
		return true;
	}

	public static void main(String [] args) {
		String str = "helloworld";
		
		if ( unique(str) )
			System.out.println(str + " is a string with only unique characters");
		else
			System.out.println(str + " is a string with duplicated characters");
		
		String str2 = "code runs";
		
		if ( unique(str2) )
			System.out.println(str2 + " is a string with only unique characters");
		else
			System.out.println(str2 + " is a string with duplicated characters");
		
		
	}
}