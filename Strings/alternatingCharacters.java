/*
 * Shashank likes strings in which consecutive characters are different. 
 * For example, he likes ABABA, while he doesn't like ABAA. Given a string 
 * containing characters  and  only, he wants to change it into a string he 
 * likes. To do this, he is allowed to delete the characters in the string.
 * Your task is to find the minimum number of required deletions.
 */
public int AlternatingChars(String input){
		
	ch = new char[input.length()];
	String str="";
	int j=0;
	for(int i=0;i<input.length();i++){
		if(i==0){
			str=str+input.charAt(i);
		}
		else{
			if(str.charAt(j) != input.charAt(i)){
				str=str+input.charAt(i);
				j++;
			}
		}
	}
	return (input.length()-str.length());
}