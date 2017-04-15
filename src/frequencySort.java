public class Solution {
    public String frequencySort(String s) {
        
        /*
         * The approach is to use a hash map and store the
         * frequecy of each character of the string. Second,
         * we try to store each character in a list at
         * an index equal to the frequncy of that character
         * in the string. Finally, we iterate from the end
         * to start of the string and append each character 
         * in the list to the string. Note: There can be 
         * more than one character for a given frequency, we
         * have to consider that case as well.
         */
        
        if(s == null || s.length()<3) return s;
        
        HashMap<Character, Integer> hm = new HashMap();
        
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                int value = hm.get(s.charAt(i));
                hm.put(s.charAt(i), value + 1);
            }
            else hm.put(s.charAt(i), 1);
        }
        
        List<Character> lists[] = new List[s.length()+1];
        
        for(Character in : hm.keySet()){
            if(lists[hm.get(in)] == null) 
                lists[hm.get(in)] = new ArrayList();
        
            lists[hm.get(in)].add(in);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=lists.length-1;i>=0;i--){
            if(lists[i]!=null){
                for(Character ch : lists[i]){
                    int value = hm.get(ch);
                    while(value-->0)
                        sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}