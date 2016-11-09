/*
* The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/

public String convert(String s, int numRows) {
    
	boolean flag=false;
	int j=0, k = (2*numRows) - 2;
	StringBuffer sb = new StringBuffer();
	for(int i=0;i<k;i++){
		for(j=0;j<s.length();j=j+k){
			if(i==0 && i+j <= s.length()-1)		sb.append(s.charAt(i+j));
			else if(i==numRows-1)	if((i+j) <= s.length()-1) sb.append(s.charAt(i+j));
				
			else{
				if(j-i>=0)	sb.append(s.charAt(j-i));
				if(j+i<=s.length()-1) sb.append(s.charAt(j+i));
			}
			if(i+j == s.length()-1) {flag=true;break;}
		}
		if(flag) break;
	}
	return sb.toString();
}