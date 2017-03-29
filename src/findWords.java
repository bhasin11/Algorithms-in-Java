public class Solution {
    public String[] findWords(String[] words) {
        
        /*
         * The approach is to create an abject which has different value for letters of each row.
         * We then traverse through each word using a for-each loop.
         * We then use a for loop and check if all letters of current word fall in the same row.
         * If yes, we add current word to our 'result' list else we move to next iteration.
         * Finally, we return our 'result' list.
         */
        
        if(words == null || words.length == 0) return words;
        List<String> result = new ArrayList<>();
        int arr[] = new int[26];

        arr['q'-'a'] = arr['w'-'a'] = arr['e'-'a'] = arr['r'-'a'] = arr['t'-'a'] = arr['y'-'a'] = arr['u'-'a'] = arr['i'-'a'] = arr['o'-'a'] = arr['p'-'a'] = 2;

        arr['a'-'a'] = arr['s'-'a'] = arr['d'-'a'] = arr['f'-'a'] = arr['g'-'a'] = arr['h'-'a'] = arr['j'-'a'] = arr['k'-'a'] = arr['l'-'a'] = 1;
        
        for(int i=0;i<words.length;i++){
            if(words[i].length() == 0) continue;
            if(words[i].length() == 1) result.add(words[i]);
            
            for(int j=1;j<words[i].length();j++){
                int t2 = (words[i].toLowerCase().charAt(j))-'a', t1 = (words[i].toLowerCase().charAt(j-1)) -'a';

                if(arr[t1] != arr[t2]) break;
                if(j==words[i].length()-1) result.add(words[i]);
            }
        }
        return result.toArray(new String[result.size()]);
        
    }
}