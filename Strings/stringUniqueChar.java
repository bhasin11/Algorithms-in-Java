/*
Given a string check if all characters of the string are unique or not.
*/

public boolean stringUniqueChar(String str){
	 id(str == null || str.length() < 2) return true;

    HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
	 
	for(int i=0;i<str.length();i++){
		if(hm.containsValue(str.charAt(i)))   return false;
		 
		 else hm.put(i, str.charAt(i));
	 }
	 
	 return true;
}

/* 
    // solution 2
    for(int i=0;i<str.length();i++){
        if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i)))
            return false;
    }
    return true;
 */

/*
* solution 3 is that we use a for loop of 128 chars and increment the 
* index with 1 each time that character is observed
* then we check complete loop again and if any value is more than 1 we
* return false
*/    