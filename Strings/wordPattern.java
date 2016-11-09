/*
* Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
*/

public boolean wordPattern(String pattern, String str) {

	if(pattern.length()==0 || str.length()==0) return false;
	
	str=str.trim();
	String[]  string = str.split(" ");
	if(pattern.length() != string.length) return false;
	
	HashMap<Character, String> hm = new HashMap<Character, String>();
	
	for(int i=0;i<pattern.length();i++){
		if(hm.containsKey(pattern.charAt(i))){
			System.out.println("char "+pattern.charAt(i)+" string "+string[i]);
			if( !(hm.get(pattern.charAt(i)).equals(string[i]))) return false;
		}
		else{
			if(hm.containsValue(string[i])) return false;
			else hm.put(pattern.charAt(i), string[i]);
		}
	}
	return true;
}