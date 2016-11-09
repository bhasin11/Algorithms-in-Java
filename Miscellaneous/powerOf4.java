// Given a number check if it is a power of 4
public boolean powerOf4(int n){
	if(n<=0) return false;
	int i=1;
	while(i<=n){
		if(i==n) return true;
		i = i << 2;
	}
	return false;
}