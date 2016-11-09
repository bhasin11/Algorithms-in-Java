/*
Given two strings representing two binary digits, return their sum as binary.
*/

public String addBinary(String a, String b) {
    if(a==""){
        if(b=="") return "";
        else return b;
    }
    else{
        if(b=="") return a;
    }
    
    int carry=0, aLength=a.length(), bLength=b.length();
    String sb = "";
    
    while(aLength>0 && bLength>0){
        aLength--;
        bLength--;
        int sum = Integer.parseInt(""+a.charAt(aLength)) + Integer.parseInt(""+b.charAt(bLength));
        sum = sum + carry;
        if(sum==2){
            sb="0"+sb;
            carry=1;
        }
        else if(sum==3){
            sb="1"+sb;
            carry=1;
        }
        else if(sum==1){
            sb="1"+sb;
            carry=0;
        }
        else{
            sb="0"+sb;
            carry=0;
        }
    }
    
    while(aLength>0){
        aLength--;
        int sum = Integer.parseInt(""+a.charAt(aLength));
        sum = sum + carry;
        if(sum==2){
            sb="0"+sb;
            carry=1;
        }
        else if(sum==1){
            sb="1"+sb;
            carry=0;
        }
        else{
            sb="0"+sb;
            carry=0;
        }
    }
    
    while(bLength>0){
         bLength--;
        int sum = Integer.parseInt(""+b.charAt(bLength));
        sum = sum + carry;
        if(sum==2){
            sb="0"+sb;
            carry=1;
        }
        else if(sum==1){
            sb="1"+sb;
            carry=0;
        }
        else{
            sb="0"+sb;
            carry=0;
        }
    }
    if(carry==1) 
    	sb="1"+sb;
    
    return sb;
}