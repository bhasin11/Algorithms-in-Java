public class MinStack {

    int value = 0, minimum = 0, topp = -1;
    MinStack topper = null, previous  = null;
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(topper == null){
            topper = new MinStack();
            topper.value = x;
            topper.minimum = x;
        }   
        else{
            MinStack mn = new MinStack();
            mn.value = x;
            mn.minimum = x > topper.minimum ? topper.minimum : x;
            mn.previous = topper;
            topper = mn;
        }
    }
    
    public void pop() {
        topper = topper.previous;
    }
    
    public int top() {
        return topper.value;
    }
    
    public int getMin() {
      return topper.minimum;  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */