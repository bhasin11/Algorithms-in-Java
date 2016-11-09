/*
* You are playing the following Bulls and Cows game with your friend: 
* You write down a number and ask your friend to guess what the number is. 
* Each time your friend makes a guess, you provide a hint that indicates 
* how many digits in said guess match your secret number exactly in both 
* digit and position (called "bulls") and how many digits match the secret 
* number but locate in the wrong position (called "cows"). Your friend 
* will use successive guesses and hints to eventually derive the secret number.
For example:

Secret number:  "1807"
Friend's guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number and 
friend's guess, use A to indicate the bulls and B to indicate the cows. 
In the above example, your function should return "1A3B".

Please note that both secret number and friend's guess may contain duplicate digits, for example:

Secret number:  "1123"
Friend's guess: "0111"
In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow, 
and your function should return "1A1B".
You may assume that the secret number and your friend's guess only contain 
digits, and their lengths are always equal.
*/

public String getHint(String secret, String guess) {
	
	// best solution
	
	int bulls = 0;
    int cows = 0;
    int[] numbers = new int[10];
    for (int i = 0; i<secret.length(); i++) {
        int s = (int) (secret.charAt(i) - '0');
        int g = (int) (guess.charAt(i) - '0');
        if (s == g) bulls++;
        else {
            if (numbers[s] < 0) cows++;
            if (numbers[g] > 0) cows++;
            numbers[s] ++;
            numbers[g] --;
        }
    }
    return bulls + "A" + cows + "B";
}

/*
	// soution 2 using hash map
	 String secret2=secret, guess2=guess;
	 HashMap<Character, Integer> hmA = new HashMap<Character, Integer>();
	 HashMap<Character, Integer> hmB = new HashMap<Character, Integer>();
	 
	 int bulls=0, cows=0;
	 for(int i=0;i<secret.length();i++){
		 if(secret2.charAt(i) == guess2.charAt(i)) bulls++;
		 
		 if(hmB.containsKey(secret2.charAt(i)) && (hmB.get(secret2.charAt(i)) != 0 )){
			 cows++;
			 int value = hmB.get(secret2.charAt(i));
			 if(value==1) hmB.remove(secret2.charAt(i));
			 else  hmB.put(secret2.charAt(i), --value);
		 }
		 else {
			 if(hmA.containsKey(secret2.charAt(i))){
				 int value = hmA.get(secret2.charAt(i));
				 hmA.put(secret2.charAt(i), ++value);
			 }
			 else hmA.put(secret2.charAt(i), 1);
		 }
		 
		 if(hmA.containsKey(guess2.charAt(i)) && (hmA.get(guess2.charAt(i)) != 0)){
			 cows++;
			 int value = hmA.get(guess2.charAt(i));
			 if(value==1) hmA.remove(guess2.charAt(i));
			 else hmA.put(guess2.charAt(i), --value); 
		 }
		 else {
			 if(hmB.containsKey(guess2.charAt(i))){
				 int value = hmB.get(guess2.charAt(i));
				 hmB.put(guess2.charAt(i), ++value);
			 }
			 else hmB.put(guess2.charAt(i), 1);
		 }
	 }
	 cows -= bulls;
	 String output = ""+bulls+"A"+cows+"B";
	 return output;
*/