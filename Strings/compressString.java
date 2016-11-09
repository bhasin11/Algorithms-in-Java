/*
Given a string return its compressed state

eg "abc" return "abc"
eg "aabbcc" return "a2b2c2"
*/

public String compressString(String input){
	
	boolean flag=true;
	 
	for(int i=0;i<input.length();i++){
		if(input.indexOf(input.charAt(i)) != input.lastIndexOf(input.charAt(i))) {
			flag=false;
			break;
		}
	}
	if(flag) return input;
	
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	
	for( int i=0;i<input.length();i++){
		if(hm.containsKey(input.charAt(i))){
			int val = hm.get(input.charAt(i));
			hm.put(input.charAt(i), ++val);
		}
		else hm.put(input.charAt(i), 1);
	}
	
	String output="";
	int x=0;
	for(int i=0;i<input.length();i++){
		if(hm.containsKey(input.charAt(i))){
			x=hm.get(input.charAt(i));
			output=output+""+input.charAt(i)+""+x;
			hm.remove(input.charAt(i));
		}
	}
	if(input.length()==output.length()) return input;
	return output;
}