/*
Given an array of integers which represents a number together.
So, arr[0] is most significant digit.
Add 1 to the number. 
*/

class PracticeArray{
    public int[] plusOne(int[] digits) {

	if(digits == null) return null;

	int lastNotNineIndex=-1;

	for(int i=0;i<digits.length;i++)
		if(digits[i] != 9) lastNotNineIndex = i;

	if(lastNotNineIndex != -1) 
		digits[lastNotNineIndex] = digits[lastNotNineIndex] + 1;

	for(int i = lastNotNineIndex+1;i<digits.length;i++)
		digits[i]=0;

	if(lastNotNineIndex == -1){
		int[] newDigits = new int[digits.length+1];
		newDigits[0] = 1;
		for(int i=1;i<digits.length;i++)
			newDigits[i] = digits[i-1];

		return newDigits;
	}
	return digits;
    }
}
