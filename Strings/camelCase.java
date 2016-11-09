/*
 * Alice wrote a sequence of words in CamelCase as a string of letters, , 
 * having the following properties:
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest 
 * of the letters are lowercase.
 * Given , print the number of words in  on a new line.
 */

public int camelCase(String str){
		
	int count=0; //assuming the string is not ""
	if(str.length()==0) return 0;
	if(str.charAt(0)>92 && str.charAt(0)<123) count=1;
	
	
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)>65 && str.charAt(i)<92) {
			System.out.println(str.charAt(i));
			count++;
		}
	}
	
	return count;
}