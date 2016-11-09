/*
Given a string check if that string is a palindrome or not.
*/

public boolean checkPalindromePermu(String input){
    	 
	if(s==null) return false;
	if(s.length()<2) return true;
	
	s=s.trim();
	s=s.toLowerCase();
	int start=0, end=s.length()-1;
	
	while(end>start){
		
		if (!Character.isLetterOrDigit(s.charAt(start))) start++;
  
		else if(!Character.isLetterOrDigit(s.charAt(end))) end--;
		
		else {
			if(s.charAt(start) != s.charAt(end)) return false;
			start++;
			end--;
		}
	}
	return true;
}

/*
solution 2: using hash map
HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	 
	 int total=0;
	 for(int i=0;i<input.length();i++){
		 if(input.charAt(i) != ' '){
			 total++;
			 if(hm.containsKey(input.charAt(i))){
				 int value = hm.get(input.charAt(i));
				 hm.put(input.charAt(i), ++value);
			 }
			 else{
				 hm.put(input.charAt(i), 1);
			 }
		 }
	 }
	 
	 int i=0, x=0;
	 
	 if(total%2==0){
		 while(i<input.length()){
			 if( input.charAt(i) != ' ' && (hm.get(input.charAt(i))%2!=0) ){
				 return false;
			 }
			 i++;
		 }
		 return true;
	 }
	 else{
		 while(i<input.length()){
			 if( input.charAt(i) != ' ' && (hm.get(input.charAt(i))%2!=0) ){
				 x++;
				 hm.put(input.charAt(i), 0);
			 }
			 if(x>1) return false;
			 i++;
		 }
		 return true;
	 }


*/

/*
// solution 3, but it assumes that all chars must be aphabets
    int c='a', total=0;
     
    for(int i=0;i<input.length();i++){
         if(input.charAt(i) != ' '){
             c ^= input.charAt(i);
             total++;
         }
     }
     c ^= 'a';
     if(total%2==0 && c != 0) return false;
     
     if(total%2==0 && c == 0) return true;
     
     if(total%2!=0 && ( (c>64 && c<91) || (c>96 && c<123) ) )
         return true; 
     
     return false;
*/