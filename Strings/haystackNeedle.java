/*
HayStack and needle problem
*/


public int strStr(String haystack, String needle) {
    if(haystack==null && needle == null) return 1;
	
	if(haystack=="" && needle =="") return 100000;
    if(needle=="" || haystack=="") return 0;
    
    if(needle.length() > haystack.length()) return -1;
    
    for(int i=0;i<(haystack.length()-needle.length());i++){
        if(needle.equals(haystack.substring(i,needle.length()))) return i;
    }
    return -1;
}