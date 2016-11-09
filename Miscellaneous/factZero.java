// find number of zeroes in the factorial of a given number

public int factZero(int n){
	int c=0;
	
	while(n>0){
		n=n/5;
		c+=n;
	}
	return c;
}