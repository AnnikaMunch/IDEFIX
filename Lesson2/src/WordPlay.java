
public class WordPlay {
	
	public static char first(String palindrome){
		return palindrome.charAt(0);
		}
	
	public static char last(String palindrome){
		return palindrome.charAt(palindrome.length()-1);
		}
	
	public static String middle(String palindrome) {
		return palindrome.substring(1, palindrome.length() - 1);
	}
	
	public static boolean isPalindrome(String palindrome) {
		
		if (first(palindrome) == last(palindrome)){
			
			String tempMiddle = middle(palindrome);
			System.out.println(tempMiddle);
			
			if(tempMiddle.length() > 1){
				
				return isPalindrome(tempMiddle);
			}
			else{
				return true;
			}
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String testString = "regninger";
		Boolean boolP = isPalindrome(testString);
		if (boolP == true)
		{
			System.out.println(testString + " is a Palindrome!");
		}
		else
		{
			System.out.println(testString + " is NOT a Palindrome!");
		}
	}
		
}
