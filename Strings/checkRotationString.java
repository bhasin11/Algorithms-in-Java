/*
Given a string and a smaller string, check if the smaller string is a substring 
of the larger string even if there are some rotations.

eg: wisdom, sdomwi should return true

*/

public int checkRotationString(String input, String check){
		
	check=check+check;
	
	for(int i=0;i<input.length();i++){
		if( (check.substring(i, (i+input.length()))).equals(input))
			return i;
	}
	return -1;
}