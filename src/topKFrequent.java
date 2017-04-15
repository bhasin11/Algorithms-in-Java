public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        /*
         * The approach is to use a hash map and store the
         * frequecy of each character of the string. Second,
         * we try to store each character in a list at
         * an index equal to the frequncy of that character
         * in the string. Finally, we iterate from the end
         * to start of the string and add each character 
         * in the list uptil 'k' times. Note: There can be 
         * more than one character for a given frequency, we
         * have to consider that case as well.
         */
        
        List<Integer> list = new ArrayList();
        HashMap<Integer, Integer> hm = new HashMap();
        
        if(nums == null || nums.length == 0) return list;
        
        for(int num : nums){
            if(hm.containsKey(num)) hm.put(num, hm.get(num)+1);
            else hm.put(num, 1);
        }
        
        List<Integer> arr[] = new List[nums.length];
        
        for(int key : hm.keySet()){
            if(arr[hm.get(key)-1] == null) 
                arr[hm.get(key)-1] = new ArrayList<Integer>();
            
            arr[hm.get(key)-1].add(key);
        }
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] != null){
                List<Integer> temp = arr[i];
                
                for(int in : temp){
                    if(list.size()==k) break;
                    
                    list.add(in);
                }
                if(list.size() == k) break;
            }
        }
        return list;
    }
}public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        /*
         * The approach is to use a hash map and store the
         * frequecy of each character of the string. Second,
         * we try to store each character in a list at
         * an index equal to the frequncy of that character
         * in the string. Finally, we iterate from the end
         * to start of the string and add each character 
         * in the list uptil 'k' times. Note: There can be 
         * more than one character for a given frequency, we
         * have to consider that case as well.
         */
        
        List<Integer> list = new ArrayList();
        HashMap<Integer, Integer> hm = new HashMap();
        
        if(nums == null || nums.length == 0) return list;
        
        for(int num : nums){
            if(hm.containsKey(num)) hm.put(num, hm.get(num)+1);
            else hm.put(num, 1);
        }
        
        List<Integer> arr[] = new List[nums.length];
        
        for(int key : hm.keySet()){
            if(arr[hm.get(key)-1] == null) 
                arr[hm.get(key)-1] = new ArrayList<Integer>();
            
            arr[hm.get(key)-1].add(key);
        }
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] != null){
                List<Integer> temp = arr[i];
                
                for(int in : temp){
                    if(list.size()==k) break;
                    
                    list.add(in);
                }
                if(list.size() == k) break;
            }
        }
        return list;
    }
}