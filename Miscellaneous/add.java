/*
 * here we have 2 numbers we have to add smaller number from a given index
 * and then add. so we have to left shift smaller number till the value of
 * end and then add it to the bigger number
 */

public int add(int biggerNum, int smallNum, int begin, int end){

	smallNum = smallNum << end;
	
	return (biggerNum + smallNum);	
}