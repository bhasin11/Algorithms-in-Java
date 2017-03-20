public String reverseString(String s) {
    if(s==null || s.length() < 2) return s;

    char[] ch = s.toCharArray();
    int start=0, end=s.length()-1;

    while(start<end){
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
        start++;
        end--;
    }

    return new String(ch);
}
