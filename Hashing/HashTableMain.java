
public class HashTableMain {

	/*
	 * Hashing and hash function

•	the process of converting a huge size input possibilities into a smaller range
	Hash tables are even faster than binary trees as they perform very fast insertion 
	and sorting
•	Above operations work at O(1) and deletion also works at O(1) sometimes
•	The disadvantage with the hash tables is that they are implemented through arrays. 
	As a result they aren’t dynamic structures and there is a lot of problem when the 
	array gets full. The solution is to periodically move the hash table to a larger 
	hash table but these operations are very heavy. So we should use hash tables when 
	we are sure about the input data Also, Visiting items of a hash table in order is 
	a difficult operation
	 
•	Hashing involves a hash function, which returns a key depending upon that particular input. 
	This key is the index of the hash table. The input is entered is put at that slot.
•	Collision: 
	Suppose the slot above is already occupied then it is known as collision. This 
	situation can be handled in many ways. Either open addressing or separate chaining

Open Addressing:
•	3 types= linear probing, quadratic probing and double hashing
•	Linear probing:
•	When we encounter collision, here we go to the next slot. We keep moving one slot at a time 
	until we find an empty slot. And we insert the input there
•	If we reach end of hash table in the above process, we wrap around and move to beginning
•	Cluster: a continuous occurrence of elements. The longer the cluster, more the performance 
	of the hashing degrades
•	Probe: the traversal to find an empty space
•	Probe length: the length traversed
•	The disadvantage of linear probing is that it helps in building clusters

•	Quadratic probing:
•	Here we don’t traverse one at a time. This prevents clustering
•	Here we traverse in x+1, x+4, x+9, x+25 ….
•	This avoids big clusters
•	But the problem here is that we always traverse through the same slots for a given index. 
	This is known as secondary clustering. As a result it is possible that we have a few 
	links blank and we always traverse through the same links

•	Double hashing
•	Here we have a second function where we calculate the hash value or key again from a 
	second function and add this value to the current occupied index
•	The second function should not give a zero value and the same result as that of the 
	first function

•	Separate chaining
•	Here the array is a collection of linked lists or arrays
•	Whenever an index is to be calculated, we go to that index and add a new link in that 
	list or add a new element in that array


•	Load factor is the result of number of elements present in the array divided by total 
	size of the array
•	Rehashing is the process of moving current elements of the array into a bigger array 
	one by one maintaining the order of the elements
•	In open hashing, unsuccessful search generally takes longer than successful search 
	as it has to continue probing until element is found or cluster is terminated


Hash function
•	The purpose of a hash function is to take key values and transform them into index 
	values such that key values are distributed randomly across all indices of the hash table

•	The efficiency of open addressing is dependent on load factor. 
•	For linear probing, as the load factor increases there will be heavy penalty on 
	performance. It is fine for half elements than size of array whereas for 2/3 there 
	will be some performance issues
•	For quadratic probing and double hashing, it is more tolerant to load factor.
•	In separate chaining, it almost depends upon number of comparison we will make within 
	each link to get to the value. 

When to use what?
•	If open addressing is to be used, double hashing is better than quadratic probing. 
	Whereas if the number of elements is fixed at the time of creation of array we 
	should go for linear probing.
•	Separate chaining should be used when we are not sure about the size of elements
•	Performance does not degrade as the size increases in separate chaining as compared 
	to open addressing methods

	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * LinearProbing lp = new LinearProbing();
		 
		DataItem dd = new DataItem(199);
		DataItem dd1 = new DataItem(199);
		DataItem dd2 = new DataItem(199);

		lp.insert(dd);

		lp.insert(dd1);
		lp.insert(dd1);
		lp.insert(dd1);

		lp.insert(dd2);
		lp.delete(dd);
		lp.find(dd1);
		lp.displayAll();
		*/
		
		/*
		QuadraticProbing qp = new QuadraticProbing();
		 
		
		DataItem d1 = new DataItem(12);
		DataItem d2 = new DataItem(15);
		DataItem d3 = new DataItem(69);
		DataItem d4 = new DataItem(12);
		DataItem d5 = new DataItem(12);
		
		qp.insert(d1);
		qp.insert(d4);
		qp.insert(d3);
		qp.insert(d2);
		qp.insert(d5);
		qp.insert(d5);
		qp.insert(d5);
		qp.insert(d5);
		qp.insert(d5);
		qp.insert(d5);
		
		qp.display();
		*/
		/*
		DoubleHashing dh = new DoubleHashing();
		
		DataItem d1 = new DataItem(12);
		DataItem d2 = new DataItem(15);
		DataItem d3 = new DataItem(14);
		DataItem d4 = new DataItem(12);
		
		dh.insert(d1);
		dh.insert(d4);
		dh.insert(d3);
		dh.insert(d2);
		
		dh.display();
		*/
		
		HashTable ht= new HashTable(100);
		
		Link newLink=new Link(999);
		Link newLink2=new Link(999);
		Link newLink3=new Link(34);
		Link newLink4=new Link(111);
		Link newLink5=new Link(12);
		Link newLink6 = new Link(34);
		Link newLink7 = new Link(34);
		Link newLink8 = new Link(34);
		ht.insert(newLink);
		ht.insert(newLink2);
		ht.insert(newLink3);
		ht.insert(newLink4);
		ht.insert(newLink5);
		ht.insert(newLink6);
		ht.insert(newLink7);
		ht.insert(newLink8);
		
		ht.display();
	}

}
