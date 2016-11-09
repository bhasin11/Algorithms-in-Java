/*
Given 3 buckets with x, y, z volume each find if x and y can be used to measure z.
*/

public boolean canMeasureWater(int x, int y, int z) {
    
	if(x==0 && y==0) return false;
	if(x==0 && y==z) return true;
	if(x==z && y==0) return true;
	if(x+y==z) return true;
	if(x+y<z) return false;
	
	Set<Integer> set = new HashSet<Integer>();
	int i=1;
	while(x%y!=0){
		if( set.contains( (int) Math.abs((x%y)-z))) return true;
		if(set.contains(x%y)) break;
		else set.add(x%y);
		x=(++i)*x;
	}
	set.clear();
	i=1;
	while(y%x!=0){
		if( set.contains( (int) Math.abs((y%x)-z))) return true;
		if(set.contains(y%x)) break;
		else set.add(y%x);
		y=(++i)*y;
	}
	return false;
}