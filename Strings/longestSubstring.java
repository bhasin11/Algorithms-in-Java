/*
 * Find the length of the longest substring T of a given string 
 * (consists of lowercase letters only) such that every character 
 * in T appears no less than k times.
 */

public int longestSubstring(String s, int k) {
	
	int base=0, max=0;
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	
	for(int i=0;i<s.length();i++){
		if(hm.containsKey(s.charAt(i))){
			int value = hm.get(s.charAt(i));
			hm.put(s.charAt(i), ++value);
		}
		else	hm.put(s.charAt(i), 1);			
	}
	
	for(int i=0;i<s.length();i++){
		if((hm.get(s.charAt(i)) >= k)){
			base++;
			max = max > (base) ? max : (base);
		}
		else	base=0;
	}
	return max;
}