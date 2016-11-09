/*
Given number of stairs calculate the number of arrangements (options) a person has to climb to that stair.

public int climbStrairs(int n){
		
	if(n==0) return 0;
	if(n==1) return 1;
	if(n==2) return 2;
	
	int sum = 0, previous=2, secondPrevious=1;
	
	for(int i=2;i<n;i++){
		sum = previous + secondPrevious;
		secondPrevious=previous;
		previous = sum;
	}
	return sum;	
}