/*
 * Alice has a binary string, , of length . She thinks a binary string is 
 * beautiful if and only if it doesn't contain the substring . In one step, 
 * Alice can change a  to a  (or vice-versa). Count and print the minimum 
 * number of steps needed to make Alice see the string as beautiful.
 */

public int beautiful(String input){
		
	int steps=0;
	
	for(int i=0;i<input.length()-2;i++){
		if(input.substring(i, i+3).equals("010")) steps++; 
	}
	return steps;
}