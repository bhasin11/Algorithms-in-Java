/*
Given a string, return the first uniwue character of the string
*/

public char firstUniqChar(String s){
        
	 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	 int value=0;
	 for(int i=0;i<s.length();i++){
		 
		 if(hm.containsKey(s.charAt(i))){
			 value=hm.get(s.charAt(i));
			 hm.put(s.charAt(i), ++value);
		 }
		 else hm.put(s.charAt(i), 1);
	 }
	 
	 for(int i=0;i<s.length();i++){
		 if(hm.get(s.charAt(i))==1) {
			 System.out.println("char is "+s.charAt(i));
			 return s.charAt(i);
		 }
	 }
	 return '\0';
}

/* 
	// there is another solution which is quite simpler.
	
	for(int i=0;i<s.length();i++)
		 if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) 
		 		return s.charAt(i);
     return '\0';  


     /*
      * this problem can also be solved through the help of an int array where for each
      * character we increment the index value of the array and then we start checking
      * for value of each char starting from the beginning of the string. first time we
      * get 1 we return that index else we return -1 when we come out of loop
      */
*/