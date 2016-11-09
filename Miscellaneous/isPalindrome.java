/*
Check if a given number is a palindrome or not.
*/

public boolean isPalindrome(int x) {
    if (x<0) return false;
    int temp = x, reverse=0;
    while (x>0){
    	reverse= reverse*10 + x%10;
    	x=x/10;
    }
    System.out.print("x and reverse "+x+" "+reverse);
    return (temp==reverse);
}