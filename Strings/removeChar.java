/*
 * Shil has a string, , consisting of  lowercase English letters. In one 
 * operation, he can delete any pair of adjacent letters with same value. 
 * For example, string "" would become either "" or "" after  operation.
 * Shil wants to reduce  as much as possible. To do this, he will repeat 
 * the above operation as many times as it can be performed. Help Shil 
 * out by finding and printing 's non-reducible form!
 */

int top=-1;
char[] ch; // I have used an array as a stack here, but you can you Stack class.
	

public String removeChar(String input){
	
	ch = new char[input.length()];
	
	for(int i=input.length()-1;i>=0;i--){
		if(i != input.length()-1){ // to avoid exception in the first iteration
			if(input.charAt(i) == peek()) pop();
			else push(input.charAt(i));
		}
		else
			push(input.charAt(i));
	}

	input="";
	for(;top>=0;top--)
		input= ""+input+peek();
	return input;
}


public char push(char c){
	ch[++top]=c;
	return ch[top];
}

public char peek(){
	return ch[top];
}

public void pop(){
	top--;
}