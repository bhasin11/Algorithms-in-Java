public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        /*
         * The approach is to sort both the arrays first.
         * Then, we will use two pointers one for each
         * array. If the values pointed by both pointers 
         * is equal we will increment both of them. We
         * will move this value to result list. Finally,
         * we will return the result array.
         */
        
        if(nums1==null || nums1.length==0 || nums2==null || nums2.length==0) return new int[0];
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> result = new ArrayList<Integer>();
        int i=0, j=0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j])    j++;
            else   i++;
        }
        
        int output[] = new int[result.size()];
        i=0;
        for(Integer in : result){
            output[i++]=in;
        }
        return output;
    }
}