/*
* Given a number, please translate it to a string, following the rules: 1 is translated 
* to 'a', 2 to 'b', …, 12 to 'l', …, 26 to 'z'. For example, the number 12258 can be 
* translated to "abbeh", "aveh", "abyh", "lbeh" and "lyh", so there are 5 different 
* ways to translate 12258. How to write a function/method to count the different ways 
* to translate a number?
*/

public int findNumbers(int[] arr){
		 
	 int x=0, c=0, i=0, len = arr.length-1;
	 
	 while(len>=0){
		 if(arr[i]!=0) c++;
		 
		 if(i<arr.length-1){
			 x= 10*arr[i]+arr[i+1];
			 if(x>0 && x<27) c++;
		 }
		 len--;
		 i++;
	 }
	 
	 return c;
}