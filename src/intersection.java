public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        /*
         * The approach is to sort both the arrays first.
         * Then, we will use two pointers one for each
         * array. If the values pointed ny both pointers 
         * is equal we will increment both of them. But, 
         * before adding the value to the result list,
         * we will also check if the same value has been
         * added before or not. We don't want to add
         * similar values to the result array. Finally,
         * we will return the result array.
         */
         if(nums1.length==0 || nums2.length==0) return new int[0];
		 
		 Set<Integer> set =new HashSet<Integer>();
		 int index1=0, index2=0, i=0;
		 int newLength = nums1.length> nums2.length ? nums2.length : nums1.length;
		 
		 Arrays.sort(nums1);
		 Arrays.sort(nums2);
		 
		 while(index1<nums1.length && index2<nums2.length){
			 if(nums1[index1] == nums2[index2]){
				 set.add(nums1[index1]);
				 index1++;
				 index2++;
			 }
			 else if(nums1[index1] > nums2[index2])   index2++;
			 else index1++;
		 }
		 if(set==null || set.size()==0) return new int[0];
		 
		 i=0;
		 int[] output = new int[set.size()];
		 
		 for(Integer x : set)	 output[i++]=x;

		 return output;
    }
}