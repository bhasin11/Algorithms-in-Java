/*
* Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements 
of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave 
beyond the new length.
*/

public int removeDuplicates2(int[] nums) {
	     
	 int i=0;
	 for(int n : nums){
		 
		 if(i<2 || n > nums[i-2]){
			 nums[i++] = n;
		 }
	 }
	int temp = i; 
	for(i=0;i<temp;i++){
			System.out.println("element "+nums[i]);
	}
	return temp;
}

/*
// solution 2: using hash map
if(nums==null) return 0;
int i=1, j=1;
HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
 
for(j=1;j<nums.length;j++){
	if(nums[j] == nums[j-1]){
		if(j==1){
			hm.put(nums[j],2);
			nums[i++]=nums[j];
		}
		if(hm.get(nums[j]) < 2){
			nums[i++]=nums[j]; 
			int value = hm.get(nums[j]);
			hm.put(nums[j],++value);
		}
	}
	else{
		hm.put(nums[j], 1);
		nums[i++]=nums[j];
	}
}

System.out.println("displaying array");

for(j=0;j<i;j++){
	System.out.println("element "+nums[j]);
}
 
 return 0;

*/