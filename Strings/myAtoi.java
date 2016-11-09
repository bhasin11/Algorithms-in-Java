/*
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. 
If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely 
(ie, no given input specs). You are responsible to gather all the input requirements up front.

*/

public int myAtoi(String str) {

	String maxInt = "2147483647", minInt = "-2147483648";
	
	str=str.trim();
	if(str.length()==0) return 0;
	
	int num=0, i=0, temp=0;
	
	boolean hasMinus = (str.charAt(0) == '-');
	boolean hasPlus = (str.charAt(0) == '+');
	
	if(hasMinus || hasPlus) i=1;
	temp=i;
	
	while(i<str.length() && str.charAt(i)>=48 && str.charAt(i)<=57)
		i++;
	
	System.out.println(str.substring(temp,i));
	
	if(temp==i) return 0;
	System.out.println("temp and i "+temp+" "+i);
	
	str=str.substring(temp, i);
	
	if(hasMinus){
		str=""+"-"+str;
		try{
			num = Integer.parseInt(str);
		}
		catch(Exception e){
			num = Integer.parseInt(minInt);
		}
	}
	
	else{
		try{
			num = Integer.parseInt(str);
		}
		catch(Exception e){
			num = Integer.parseInt(maxInt);
		}
	}
	return num;
}