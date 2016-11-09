/*
 * John has discovered various rocks. Each rock is composed of various 
 * elements, and each element is represented by a lower-case Latin letter 
 * from 'a' to 'z'. An element can be present multiple times in a rock. 
 * An element is called a gem-element if it occurs at least once in each 
 * of the rocks. Given the list of rocks with their compositions, display 
 * the number of gem-elements that exist in those rocks.
 */

public int gemstones(String[] input){
		
	boolean[][] arr = new boolean[26][input.length];
	String term = "";
	for(int i=0;i<input.length;i++){
		term = input[i];
		for(int j=0;j<term.length();j++){
			int value = term.charAt(j)-97;
			arr[value][i]=true;
		}
	}
	int count=0;
	for(int i=0;i<26;i++)
		if(arr[i][0] && arr[i][1] && arr[i][2]) count++;
	
	return count;
}