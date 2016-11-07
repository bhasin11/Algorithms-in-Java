/*
Given a string return its reversed form, without library functions.
*/
class PracticeStrings{
	
	public String reverseString(String str){
		char ch1='\0';
		int j=str.length()-1;
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<str.length()/2;j--,i++){
			ch1=ch[i];
			ch[i]=ch[j];
			ch[j]=ch1;
		}
		
		return new String(ch);
	}
	/* second method using stack
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
	*/
}