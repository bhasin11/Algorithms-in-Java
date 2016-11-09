/*
  * There is a village of wizards and a village of dwarves. Once a year, the wizards go over to 
  * the village of dwarves and line all the dwarves up in increasing height order, such that each 
  * dwarf can only see the dwarves smaller than himself. The wizards have an infinite supply of 
  * white and black hats. They place either a white or black hat on the head of each dwarf. 
  * Then, starting with the tallest dwarf (in the back of the line), they ask each what color 
  * hat he is wearing. If the dwarf answers incorrectly, the wizards kill him (the other 
  * dwarves can hear his answer, but can't tell if he was killed or not). What strategy can t
  * he dwarves use to minimize the number of dwarves that are killed? What is the most number of 
  * dwarves that will be killed using this optimal strategy? (solution)
  */
public int blackWhite(String arr[]){
		 
	int dead=0;

	String answer="black";
	int sum=0, lastSum=0;
	for(int i=0;i<arr.length;i++){
	 for(int j=i+1;j<arr.length;j++){
		 if(arr[j].equals("white")) sum++;
	 }	 
		 if(sum%2==lastSum%2) answer="black";
		 else answer="white";
		 
		 if(!answer.equals(arr[i])) dead++;
		 lastSum=sum;
		 sum=0;
	}
	return dead;
}