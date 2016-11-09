/*
Given an array of words(strings) and 2 words, find the shortest distance between the words.

*/

public int shortestDistance(String[] words, String word1, String word2) {
	    
	int index1=-1, index2=-1, distance=100000000;
	
	for(int i=0;i<words.length;i++){
		if(words[i]==word1){
			index1=i;
			if(index2 != -1) distance = distance < (index1-index2) ? distance : index1-index2;
		}

		if(words[i]==word2){
			index2=i;
			if(index1 != -1) distance = distance < (index2-index1) ? distance : index2-index1;
		}
	}
	return distance;
}