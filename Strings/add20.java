/*

Given a string , return a new String where each space is replaced by %20

*/

class PracticeStrings{
	public String add20(String input){
		if(input==null || input == "") return input;
		
		int i=input.indexOf(' ');
		while(i<input.length() && i != -1){
			input=(input.substring(0, i)).concat("%20"+input.substring(i+1, input.length()));
			i=input.indexOf(' ');
		}
		return input;
	}
}