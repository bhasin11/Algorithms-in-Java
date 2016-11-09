import java.util.LinkedList;
import java.util.Queue;
/*
Moving average from data stream.
Find the average length of the last 3 data streams.
*/

public class PracticeQueues {

	int window=0;
	private static int counter=0;
	private static int sum=0;
	Queue<Integer> queue;
	PracticeQueues(int size){
		window=size;
		queue = new LinkedList<Integer>();
	}
	
	public int average(int a){
		int avg=0;
		counter++;
		if(counter<=window){
			queue.offer(a);
			sum += a;
			avg = sum/counter;
		}
		else{
			sum-=queue.peek();
			queue.poll();
			avg = sum/window;
		}
		
		return avg;
	}
}
