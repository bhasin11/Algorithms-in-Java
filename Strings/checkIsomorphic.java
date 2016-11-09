/*
 * Given two strings s and t, determine if they are isomorphic.
	Two strings are isomorphic if the characters in s can be replaced to get t.
	All occurrences of a character must be replaced with another character 
	while preserving the order of characters. No two characters may map to the 
	same character but a character may map to itself.

	For example,
	Given "egg", "add", return true.
	Given "foo", "bar", return false.
	Given "paper", "title", return true.
 */

public boolean checkIsomorphicString(String a, String b){
		
	int[] ch = new int[128];
	int[] val = new int[128];
	
	for(int i=0;i<a.length();i++){
		int p = (int) a.charAt(i);
		int q = (int) b.charAt(i);
		
		if(ch[p]==0 && val[q]==0){
			ch[p] = q;
			val[q]=1;
		}
		else if(ch[p] != q) return false;
	}
	
	return true;
}

/*
	// solution 1 : almost solves all test cases 
		 
	HashMap<Character,Character> hm = new HashMap<Character, Character>();
	HashMap<Character,Character> hm2 = new HashMap<Character, Character>();
	int i=0;
	while(i<a.length()){
		if(hm.containsKey(a.charAt(i))){
			if( !( (""+hm.get(a.charAt(i))).equals(""+b.charAt(i)) ) ) return false;
		}
		else {
			if(hm.containsValue(b.charAt(i))) return false;
			hm.put(a.charAt(i), b.charAt(i));
		}
		
		if(hm2.containsKey(b.charAt(i))){
			if( !( (""+hm2.get(b.charAt(i))).equals(""+a.charAt(i)) ) ) return false;
		}
		else {
			if(hm2.containsKey(a.charAt(i))) return false;
			hm.put(b.charAt(i), a.charAt(i));
		}
		
		i++;
	}
	return true;
*/