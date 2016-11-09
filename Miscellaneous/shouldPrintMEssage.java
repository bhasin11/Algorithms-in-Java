// return true if the message doesn't exist or it came 10 seconds 
// before or more else return false

public boolean shouldPrintMessage(String message, int time){
	
	if(hm.containsKey(message)){
		if( time - (hm.get(message)) > 10) {
			return true;
		}
		else return false;
	}
	else{
		hm.put(message, time);
		return true;
	}
}