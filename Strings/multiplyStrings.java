/*
Given 2 integers as strings return the product of the 2 in the form of string
*/

public String multiply(String left, String right) {
        if(left.equals("0") || right.equals("0"))
            return "0";
        
        // use p to accumulate sum of prod.    
        int[] p = new int[left.length() + right.length()] ;
        left = new StringBuilder(left).reverse().toString();
        right = new StringBuilder(right).reverse().toString();
        
        for(int i =0; i < left.length(); i ++){
            for(int j =0; j < right.length(); j ++){
                int val = (left.charAt(i) -'0') * (right.charAt(j) -'0');
                p[i+j] += val;
            }
        }
        
        // convet p into string
        int carry =0;    
        StringBuilder sb = new StringBuilder();
        
        for(int v: p){
            v += carry;
            carry = v/10;
            v %= 10;
            
            sb.append(v);
        }
        
        if(carry > 0 )
            throw new RuntimeException("wrong code");
        
        String ret = sb.reverse().toString();
        return ret.charAt(0) == '0' ? ret.substring(1) : ret;
    }