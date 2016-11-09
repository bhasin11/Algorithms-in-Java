/*
Given a sentence of many words return the length of the last word.

*/

public int lengthOfLastWord(String s) {
	        
     if(s.length()==0) return 0;
     
     int i = s.lastIndexOf(' ');
     int j= s.length();

     if(i==-1) return j;
     if(i==j-1) return (lengthOfLastWord(s.substring(0, i))); // above if is when the sequence has ' ' as the last character
     
     else return (j-i-1);
}