/*

Given a number in the form of string , check if it is Strobogrammatic Number.

A Strobogrammatic Number is a number which is same after rotating 180 degress.
*/

public boolean strobogrammaticNumber(String num){
		
	int start = 0, end =num.length()-1;
	
	while(start<end){
		if(num.charAt(start)=='6' && num.charAt(end)=='9') return false;
		if(num.charAt(start)=='9' && num.charAt(end)=='6') return false;
		if(num.charAt(start)=='0' || num.charAt(end)=='8') return false;
		 
		start++;
		end--;
	}
	return true;
}