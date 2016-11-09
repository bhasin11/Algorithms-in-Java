/*
here we have to find the common elements of both the arrays and return an array of common and unique numbers
eg:
nums1: 1,2,2
nums2: 2,3
return: 2
*/

public int[] intersection(int[] nums1, int[] nums2) {
	 
	int[] out=new int[0];
    if(nums1.length==0 || nums2.length==0) return out;
	 
	 Arrays.sort(nums1);
	 Arrays.sort(nums2);
	 Set<Integer> set =new HashSet<Integer>();
	 int index1=0, index2=0, i=0;
	 
	 while(index1<nums1.length && index2<nums2.length){
		 if(nums1[index1] == nums2[index2]){
			 set.add(nums1[index1]);
			 index1++;
			 index2++;
		 }
		 else{
			 if(nums1[index1] > nums2[index2])   index2++;
			 
			 else index1++;
		 }
	 }
	 if(set==null || set.size()==0) return out;
	 
	 i=0;
	 int[] output = new int[set.size()];
	 
	 for(Integer x : set){
		 output[i++]=x;
	 }
	 
	 return output;
}

/*
* what we can also do is we can add all elements of smaller array in hash map and then check if  any
* element of the second array is present in hash map or not. if yes, we add that element to an array 
*. then we can return that array.
*/