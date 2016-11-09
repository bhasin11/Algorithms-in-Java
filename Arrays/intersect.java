/*
here we have to find the common elements of both the arrays and return an array of all common numbers
eg:
nums1: 1,2,2
nums2: 2,2,3
return: 2,2
*/

public int[] intersect(int[] nums1, int[] nums2) {
	  
	int[] out=new int[0];
    if(nums1.length==0 || nums2.length==0) return out;
	
    ArrayList<Integer> list = new ArrayList<Integer>();
    Arrays.sort(nums1);
	Arrays.sort(nums2);
	int index1=0, index2=0, i=0;
	 
	while(index1<nums1.length && index2<nums2.length){
		if(nums1[index1] == nums2[index2]){
			list.add(nums1[index1]);
			index1++;
			index2++;
		}
		else{
			if(nums1[index1] > nums2[index2])   index2++;
			 
			else index1++;
		}
	}
	if(list.size()==0) return out;
	int[] output = new int[list.size()];
	
	for(Integer in : list){
		output[i++] = in;
	}
	 
	return output;
 }