/*
Given 2 sorted arrays, find median of all elements of both the arrays.
*/

public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	 
	 int last=0, totalLength = nums1.length+nums2.length, j=0, index1=0, index2=0;
	 
	 while(j<totalLength/2 && index1<nums1.length && index2<nums2.length){
		 if(nums1[index1] > nums2[index2])	 last=nums2[index2++];
		 else	last=nums1[index1++];
		 j++;
	 }
	 
	 while(j<totalLength/2 && index1<nums1.length){
		 last=nums1[index1++]; 
		 j++;
	 }
	 
	 while(j<totalLength/2 && index2<nums2.length){
		 last=nums2[index2++]; 
		 j++;
	 }
	 
	 if(totalLength%2 != 0){
		 if(index1 == nums1.length) return (double)nums2[index2];
		 if(index2 == nums2.length) return (double)nums1[index1];
		 if(nums1[index1] > nums2[index2])	 return (double)nums2[index2];
		 else	return (double)nums1[index1];
	 }
	 
	 else{
		 System.out.println("index2 "+index2);
		 if(index1 == nums1.length) return (double)(nums2[index2]+last)/2;
		 if(index2 == nums2.length) return (double)(nums1[index1]+last)/2;
		 if(nums1[index1] > nums2[index2])	 return (double)(nums2[index2]+last)/2;
		 else	return (double)(nums1[index1]+last)/2;
	 }
 }