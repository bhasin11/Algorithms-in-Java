/*
Given 2 numbers find the AND of all the numbers in that range and return it.
It seems to be a simple question but the thing is what if we get a value of 1 and 2929292929.
It wont be feasable to find and of each number. So, I have providede a better solution.
This solution works at logn order.
*/


public int rangeBitwiseAnd(int m, int n) {
    if(m==0 || m==n) return m;
    int total=0;
    int a=1;
    while(m>=a){
        a=a*2;
    }
    a=a/2;
    int b=1;
    while(n>=b){
        b=b*2;
        if(b>a) return 0;
    }
    b=b/2;
    if(a==b)	return (a + rangeBitwiseAnd(m-a,n-a));
    
    else return 0;
}