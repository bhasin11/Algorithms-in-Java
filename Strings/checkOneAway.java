/*
 * either the two strings can have a char missing or a char inserted or 
 * a different char. if they have more than this return false else 
 * return true
 */

public boolean checkOneAway(String a , String b){
		
	
	int counter=0;
	 
	if(a.length() == b.length()){
		for(int i=0;i<a.length();i++){
			if(a.charAt(i) != b.charAt(i)) counter++;
		}
		if(counter>1) return false;
		else return true;
	}
	
	int j=0;
	if(a.length()>b.length()){
		while( (j<b.length()) && (a.charAt(j) == b.charAt(j)) ){
			j++;
		}
		if(j==b.length()-1) return true;
		else{
			int i=j+1;
			for(int p=j;p<b.length();p++){
				if(a.charAt(i) != b.charAt(p)) return false;
				i++;
			}
			return true;
		}
	}
	return false;
}