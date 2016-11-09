/*
 * Roy wanted to increase his typing speed for programming contests. So, his 
 * friend advised him to type the sentence "The quick brown fox jumps over the 
 * lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences 
 * constructed by using every letter of the alphabet at least once.) 
 * After typing the sentence several times, Roy became bored with it. 
 * So he started to look for other pangrams. Given a sentence , tell Roy if 
 * it is a pangram or not.
 */

public boolean panagrams(String input){
	
	input=input.toLowerCase();
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

	for(int i=0;i<input.length();i++){
		if(! (hm.containsKey(input.charAt(i))) && (input.charAt(i) != ' ') ){
			hm.put(input.charAt(i), 1);
		}
		if(hm.size()==26) return true;
	}

	return false;
}