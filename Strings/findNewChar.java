/*

Given two strings s and t which consist of only lowercase letters.
String t is generated by random shuffling string s and then add 
one more letter at a random position. Find the letter that was added in t.
*/
class PracticeStrings{
	public char findNewChar(String s, String t){
			
		// solution 1 : using XOR
		if(s==null || s=="" || t==null || t=="") return '\0';

		char c='\0';
		int j= (int) c;
		for(int i=0;i<s.length();i++){
		    c^=s.charAt(i);
		    c^=t.charAt(i);
		}
		c^=t.charAt(t.length()-1);
		
		return (char) c;

		/* solution 2 : using ASCII values of each character
		int sum=0;
		for(int i=0;i<s.length();i++){
			sum +=(int) (t.charAt(i));
	        sum -= (int) (s.charAt(i));
	    }
	        
	    sum += (int) t.charAt(t.length()-1);
	    
	    return (char)(sum);
	    */
	}
}