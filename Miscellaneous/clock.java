/*
Given current time in form of hours and minutes, find the time after adding addMinutes to current time.
(addMinutess can be -ve which means that we may have to return a time which has passed.)
*/

public String clock(int hours, int minutes, int addMinutes){
		
	int totalMinutes = minutes + addMinutes;
	int temp = totalMinutes;
	totalMinutes = totalMinutes%60;
	
	if(totalMinutes<0){
		hours=hours-1;
		totalMinutes = -totalMinutes;
		totalMinutes = 60-totalMinutes;
	}

	hours=hours+(temp/60);
	
	if(hours<0){
		hours=-hours;
		hours=hours%24;
		hours=24-hours;
	}
	
	String output="";
	if(hours<10) output="0"+hours;
	else output=""+hours;
	if(totalMinutes<10)		output=output+" 0"+totalMinutes;
	else output=output+" "+totalMinutes;
	
	return output;
}