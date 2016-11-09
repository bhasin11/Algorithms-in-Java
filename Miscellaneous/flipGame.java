/*
You are playing the following Flip Game with your friend: 
Given a string that contains only these two characters: + and -, you and your friend 
take turns to flip two consecutive "++" into "--". The game ends when a person can no 
longer make a move and therefore the other person will be the winner.

Write a function to compute all possible states of the string after one valid move.

For example, given s = "++++", after one move, it may become one of the following states:

[
  "--++",
  "+--+",
  "++--"
]
If there is no valid move, return an empty list [].
*/

public List flipGame(String input){
		
	List<String> list = new ArrayList<String>();
	if(input==null) return null;
	if(input.length() < 2) return list; 
		
	for(int i=1;i<input.length();i++){
		if(input.charAt(i) == input.charAt(i-1)){
			if(input.charAt(i) == '+'){
				System.out.println("1");
				if(i == input.length()-1) list.add(""+input.substring(0, i-1)+"--");
				else list.add(""+input.substring(0, i-1)+"--"+input.substring(i+1));
			}
			else{
				System.out.println("2");
				
				if(i == input.length()-1) list.add(""+input.substring(0, i-1)+"++");
				else list.add(""+input.substring(0, i-1)+"++"+input.substring(i+1));
			}
		}
	}
	
	return list;
}