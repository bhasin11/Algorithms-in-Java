/*
Given an array of words, find the longest common prefix substring 
*/
public String longestCommonPrefix(String[] strs) {
    if(strs==null) return null;
    if(strs.length==1) return strs[0];
    char test='0';
    boolean flag=false;
    StringBuffer sb = new StringBuffer();
    for(int i=0;i<strs[0].length();i++){
        test = strs[0].charAt(i);
        
        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length() || strs[j].charAt(i) != test){flag=true; break;}
        }
        if(flag) break;
        sb.append(""+test);
    }
    return ""+sb;
}