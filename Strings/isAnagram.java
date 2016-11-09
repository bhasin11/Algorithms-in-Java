public boolean isAnagram(String s, String t) {
    
	if(s==null || t==null) return false;
	if(s.length()!= t.length()) return false;
		
	int[] arr = new int[26];
	
	for(int i=0;i<s.length();i++){
		arr[s.charAt(i)-'a']++;
		arr[t.charAt(i)-'a']--;
	}
	
	for(int i=0;i<26;i++){
		if(arr[i]!=0) return false;
	}
	return true;
}


/*

	if(s==null || t==null) return false;
	if(s.length()!= t.length()) return false;

	
	 // using hash map make sthe solution slow, try to use array instead
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	
	for(int i=0;i<s.length();i++){
		if(hm.containsKey(s.charAt(i))){
			int value = hm.get(s.charAt(i));
			hm.put(s.charAt(i), ++value);
		}
		else hm.put(s.charAt(i), 1);
		
		if(hm.containsKey(t.charAt(i))){
			int value = hm.get(t.charAt(i));
			hm.put(t.charAt(i), --value);
		}
		else hm.put(t.charAt(i), -1);
	}
	
	for(int i=0;i<s.length();i++){
		if(hm.get(s.charAt(i)) != 0) return false;
	}
	return true;

*/