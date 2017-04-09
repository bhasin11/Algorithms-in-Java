public class NumArray {

    /*
     * The approach is to save the sum of values
     * of an array from begining uptil the current
     * index into the current index. So, we will
     * get an array where each value will represent 
     * sum of values of the array uptil itself. For
     * any give start and end index, now we just
     * have to return the difference of values for
     * those two indexes.
     */
     
    int nums[];
    public NumArray(int[] nums) {
        this.nums=nums;
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
    }
    
    public int sumRange(int i, int j) {
        if(i == 0) return nums[j];
        return nums[j] - nums[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */