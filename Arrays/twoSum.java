/*
Given an array of numbers return an array of 2 which add up to make the target value.
If no such values present, return null
*/

public int[] twoSum(int[] numbers, int target) {
		
	nt[] output = new int[2];
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    
    for(int i=0;i<numbers.length;i++){
        if(hm.containsKey(target-numbers[i])){
            output[0] = hm.get(target-numbers[i]);
            output[1] = i+1;
            return output;
        }
        else hm.put(numbers[i],i+1);
    }
    return null;

}    

/*
	// good solution, but this solution is valid when the array is sorted
	
	int sum=0, start=0, end = numbers.length-1;
	int[] arr = new int[2];
	
	while(start<end){
		sum = numbers[start] + numbers[end];
		if(sum == target){
			arr[0] = start+1;
			arr[1] = end+1;
			return arr;
		}
		
		if(sum>target) end--;
		else start++;
	}
	
	return null;
*/