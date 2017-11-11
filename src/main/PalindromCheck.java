package main;

public class PalindromCheck {
	public static Boolean PaliCheck(String Palindrom )
	{
		int dlugosc = Palindrom.length()-1;
		for (int i = 0 ; i<Palindrom.length()/2;i++)
		{
			if (Palindrom.charAt(i)!=Palindrom.charAt(dlugosc-i))
			{
				//System.out.println(Palindrom.charAt(i) + " "+ Palindrom.charAt(dlugosc-i));
				return false; 
			}
		}
		
		return true;
		
	}
}
