/*
given a string integer, return its hex value.
*/

public String stringToHex(int num) {
    if(num==0) return "0";
    long temp=num & 0x00000000ffffffffL;
    String output = "";
    char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    while(temp!=0){
    	output = ""+map[(int)(temp & 15)] + output;
    	temp=temp/16;
    }
    
    return output;
}