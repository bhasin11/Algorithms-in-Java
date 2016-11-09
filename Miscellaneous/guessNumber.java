/*
You have to guess a random number that computer has chosen.
It returns 0 if you get it right, -1 if your guess is greater and 1 id your guess is smaller.
Find the number computer choose.
*/


static int variable = 6;// can be initialized through constructor.

public int guessNumber(int n) {
        
	int temp=0, number = 1000, i=1, roof=n, floor=1;
	
	while(true){
		i=guess(number);
		if(i==0) break;
		if(i==-1) roof = number;
		else floor=number+1;
		
		temp = roof-floor;
		if(temp==0) number=number+1;
		else{
			number %= temp;
			number += floor;
		}
	}
	
    return number;
    /*for(int i=0;i<=n;i++){
        if(guess(i) == 0) return i;
    }
    
    return 0;
    */
}

public int guess(int n){
	System.out.println("static variable is "+variable);
	
	if(n==variable) return 0;
	if(n>variable) return -1;
	else return 1;
}