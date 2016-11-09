/*
Given 2 sorted char arrays return a merged sorted char array.

*/

public char[] chartostring(char[] s, char[] t){
	 int len = s.length + t.length, i=0, p1=0, p2=0;
	 char[] target = new char[len];
	 while(i<len){
		 if(p1<s.length){
			 target[i++] = s[p1++];
		 }
		 if(p2<t.length){
			 target[i++] = t[p2++];
		 }
	 }
	 return target;
}