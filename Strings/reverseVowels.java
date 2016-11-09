/*
Given a string of one or more words, return a new string which reverses all the vowels .

eg1: "apple" becomes "eppla"

eg2: "I love programming" becomes "i lavo pregrommIng:

*/

public String reverseVowels(String s) {
    	 
	 char temp='a';
	 int begin=0, end=s.length()-1;
	 char[] ch = s.toCharArray();
	 
	 while(begin<end){
		 if( (ch[begin] == 'a' || ch[begin] == 'e' || ch[begin] == 'i' || 
				 ch[begin] == 'o' || ch[begin] == 'u' || ch[begin] == 'A' || 
				 ch[begin] == 'E' || ch[begin] == 'I' || ch[begin] == 'O' || 
				 ch[begin] == 'U') && 
				 ( ch[end] == 'a' || ch[end] == 'e' || ch[end] == 'i' || 
				 ch[end] == 'o' || ch[end] == 'u' || ch[end] == 'A' || 
				 ch[end] == 'E' || ch[end] == 'I' || ch[end] == 'O' || 
				 ch[end] == 'U') ){
			 temp = ch[begin];
			 ch[begin] = ch[end];
			 ch[end]=temp;
			 begin++;
			 end--;
		 }
		 
		 if(ch[begin] != 'a' && ch[begin] != 'e' && ch[begin] != 'i' && 
				 ch[begin] != 'o' && ch[begin] != 'u' && ch[begin] != 'A' && 
				 ch[begin] != 'E' && ch[begin] != 'I' && ch[begin] != 'O' && 
				 ch[begin] != 'U')
			 begin++;
		 
		 if(ch[end] != 'a' && ch[end] != 'e' && ch[end] != 'i' && 
				 ch[end] != 'o' && ch[end] != 'u' && ch[end] != 'A' && 
				 ch[end] != 'E' && ch[end] != 'I' && ch[end] != 'O' && 
				 ch[end] != 'U')
			 end--;
	 }
	 return (new String(ch));
}