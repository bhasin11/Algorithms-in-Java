/*
A number is given in the form of a string, convert it into int without using library finctions
/*
class PracticeStrings{
	public int stringToInt(String s){
		
		if(s== null || s=="") return 0;
		int sum=0, temp=0;
		
		for(i=0;i<=s.length()-1;i++){
			temp = (int) s.charAt(i)-'0';
			sum=sum*10;
			sum+=temp;
		}
		return sum;
	}
}