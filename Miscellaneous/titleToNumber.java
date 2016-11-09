/*
An input string will be in the form of AA, A or ZCD... anything.
We have to find the column number of the string.
for A it will be 1
for AA it will be 27
*/

public int titleToNumber(String s) {
        
	int val=0;
	for(int i=0;i<s.length();i++){
		val=val * 26 + ((int)s.charAt(i) - 'A') + 1;
	}
	return val;
}