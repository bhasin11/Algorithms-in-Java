/*
given two strings check if they are permutation of each other or not.
*/

public boolean permuString(String a, String b){
    	 
	 if(a.length() != b.length()) return false;
	  
	 
	 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	 
	 for(int i=0;i<a.length();i++){
		 if(hm.containsKey(a.charAt(i))){
			 int value = hm.get(a.charAt(i));
			 hm.put(a.charAt(i), ++value);
		 }
		 else{
			 hm.put(a.charAt(i), 1);
		}
		 
		 if(hm.containsKey(b.charAt(i))){
			 int value = hm.get(b.charAt(i));
			 hm.put(b.charAt(i), --value);
		 }
		 else{
			 hm.put(b.charAt(i), -1);
		 }
	 }
	 
	 for(int i=0;i<a.length();i++){
		 if(hm.get(a.charAt(i)) != 0) return false;
	 }
	 
	 return true;
}

/*
* another solution could be if we add each element with character
* and then subtract each one of them from the array (like above problem)
*/