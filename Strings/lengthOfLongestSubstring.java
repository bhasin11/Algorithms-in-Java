/*
 * Given a string, find the length of the longest substring without repeating characters.
	Examples:

	Given "abcabcbb", the answer is "abc", which the length is 3.
	Given "bbbbb", the answer is "b", with the length of 1.
	Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be 
	a substring, "pwke" is a subsequence and not a substring.
 */

public int lengthOfLongestSubstring(String s) {
	
	int base=0, max=0, size=0;
	int[] index = new int[256];
	
	for(int i=0;i<s.length();i++){
		
		if(index[s.charAt(i)]==0 || index[s.charAt(i)]<base){
			index[s.charAt(i)] = i+1;
			size++;
			max = size > max ? size : max;
		}
		else{
			base = index[s.charAt(i)]+1;
			size = i - index[s.charAt(i)] +1;
			index[s.charAt(i)] = i+1;
		}
	}
	
	return max;
}


/*
	// solution 2 using hash map
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	int counter=0, max = 0, j=0;
	
	for(int i=0;i<s.length();i++){
		j=i;
		while(j<s.length()){
			if(hm.containsKey(s.charAt(j))){
				hm.clear();
				break;
				
			}
				
			else{
				hm.put(s.charAt(j), 1);
				counter++;
			}
			j++;
		}
		max = counter > max ? counter : max;
		counter=0;
	}
	return max;
*/