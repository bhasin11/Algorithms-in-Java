/*
* How do you reverse the order of the words (not the characters) in a string of 
* length n in with constant extra space in linear time? 
*/

public String reverseWords(String s){
		 
	s=s.trim();
	if(s=="") return "";
	s=s.replaceAll(" +"," ");
    char[] ch = s.toCharArray();
	
    reverseString(ch,0,ch.length-1);
	int start=0;
    for(int i=0;i<ch.length;i++){
		if(ch[i] == ' '){
			//reverse from start to i-1 and then start = i+1
			reverseString(ch,start,i-1);
			start = i+1;
		}
	}
	reverseString(ch,start,ch.length-1);
	
	return new String (ch);
}
	
public String reverseString(String str){
		
	StringBuilder sb = new StringBuilder(""); // has more effecient append method than String
	Stack<Character> stack = new Stack<Character>();
	int i=0;
	while(i<str.length()){
		stack.push(str.charAt(i));
		i++;
	}
	while(!stack.isEmpty()){
		sb=sb.append(""+stack.pop());
	}
	return sb.toString();
}