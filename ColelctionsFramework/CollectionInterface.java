import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionInterface {

	// it is core of all collection interfaces
	// below methods are common for all collection interfaces
	
	List<String> list = new ArrayList<String>();
	
	public void collectionDemo(){
		
		System.out.println("a :"+list.add("a"));
		 
		System.out.println("b :"+list.add("b"));
		System.out.println("c :"+list.add("c"));
		System.out.println("a :"+list.add("a"));
		
		/*
		 * the add function of collection interface returns true if there is no such object 
		 * already present and false if the element already exist. but if the interface 
		 * implemented allows duplication it will still return true. in case of list above,
		 * it allows and thats why we get true when we try to add a second time 
		 */
		
		List<String> c = new ArrayList<String>();
		
		c.add("n1");
		 
		c.add("n2");
		c.add("n3");
		
		// boolean addAll(Collection c) adds all the collection objects to invoking collection and
		// returns true if all done else false	
		System.out.println("coll add: "+(list.addAll(c)));
		
		// boolean contains(Obj e) returns true if the object is found in the 
		// invoking string else returns false
		
		System.out.println("contains check "+list.contains("n1"));
		
		/*
		 * boolean containsAll(coll c) it checks if the invoking collection has all
		 * elements of collection c. if the collection c does not contain any element
		 * it always return true even if invoking collection is empty
		 */
		System.out.println("contains coll: "+list.containsAll(c));
		
		/*
		 * boolean equals(object)
		 * return true if invoking collection and object are equal
		 */
		System.out.println("equal check "+list.equals("n1"));
		
		/*
		 * int hashCode()
		 * returns the hashcode of the invoking collection
		 */
		
		System.out.println("hashcode: "+list.hashCode());
		
		/*
		 * boolean isEmpty()
		 * returns true if collection is empty
		 */
		
		System.out.println("empty check "+list.isEmpty());
		
		/*
		 * boolean remove
		 * returns true when element found and removed else returns false
		 */
		
		System.out.println("remove element "+list.remove("a1"));
		
		/*
		 * boolean removeAll(collection c)
		 * removes all elements of c from the invoking collection and returns true
		 */
		
		System.out.println("remove collection "+list.removeAll(c));
		
		/* !!!!!!!!!!!!!!
		 * boolean retainAll(collection c)
		 * removes all elements from invoking collection except those in c
		 */
		List c2= new ArrayList();
		//System.out.println("retain check: "+list.retainAll(c));
		
		/*
		 * int size()
		 * returns size
		 */
		System.out.println("size "+list.size());
		
		System.out.println("\t"+list);
		
		/*
		 * Object[] toArray()
		 * returns an array that has all elements stored in the invoking collection
		 */
		
		// void clear removes all elements from the collection
		
		list.clear();
		
		
		
	}

	public void listDemo(){
		
		/*
		 * void add(int index, object ob)
		 * inserts the ob at index and moves all preexisting eleents one up
		 */
		
		 list.add(0, "a");
		 list.add("abc");
		 
		 /*
		  * boolean add(int index, collection c)
		  * inserts collection c at index and moves current elements upwards
		  */
		 List c = new ArrayList();
		 c.add("e");
		 c.add("e2");
		 //System.out.println("add check "+list.addAll(2, c));
		 
		 /*
		  * object get(int index)
		  * returns object stored at a index within invoking collection
		  */
		 
		 String str = list.get(1);
		 //System.out.println("string at index "+str);
		 
		 /*
		  * int indexOf(object o)
		  * returns the index f first instance of the invoking list
		  * if not present .1 is returned
		  */
		 
		 //System.out.println("index "+list.indexOf("e2"));
		 
		 /*
		  * int lastIndexOF(object o)
		  * returns the index of last instance of object
		  * if not present .1 is returned
		  */
		 //System.out.println("last index "+list.lastIndexOf("a"));
		 
		 /*
		  * object remove(int index)
		  * removes the object at index and the list is compacted
		  */
		 
		 //System.out.println("deleted is "+list.remove(2));
		 
		 /*
		  * object set(int index, object o)
		  * sets the object at the index thus overrides if anything exists currently
		  */
		 
		// System.out.println("inserted "+list.set(2, "xx"));
		 
		 /*
		  * list subList(int start, int end)
		  * returns a list frm start to end, excluding end
		  */
		 //System.out.println("size: "+list.size());
		 //System.out.println("\t"+(list.subList(0, 3)));
		 
		 // list iterator
		 
		 ListIterator li = list.listIterator();
		 //li.remove();
		 /*
		  * void add(object O)
		  * inserts element into the list wherever current is
		  */
		 
		 //li.add("assd");
		 
		 /*
		  * boolean hasNext()
		  * returns true if pointer has next value else false
		  */
		 
		 //System.out.println("check hasNext "+li.hasNext());
		 
		 /*
		  * boolean hasPrevious()
		  * return s true if pointer has a previous value else false
		  */
		 
		 //System.out.println("check hasPrevious "+li.hasPrevious());
		 
		 /*
		  * object next
		  * returns the next element if there else exception is thrown
		  * similar is previous
		  */
	
		 while(li.hasNext()){
			 Object ele = li.next();
			 System.out.println("element "+ele);
		 }
	
		 /*
		  * int nextIndex()
		  * returns the index of the next element if there else returns sixe of list
		  * similar is previousIndex()
		  */
		 
		 //System.out.println("next index check "+li.nextIndex());
		 
		 /*
		  * void remove()
		  * next() or previous() must be invoked before using this
		  * removes the current element
		  */
		 
		 // li.remove();
	
		 /*
		  * void set(object o)
		  * next() or previous() must be invoked before using this
		  * sets the current element to object o
		  */
		// li.previousIndex();
		 //li.add("EEE");
		 
		 List<Integer> l1 = new LinkedList<Integer>();
		 List<Integer> l2 = new LinkedList<Integer>();
		 List<Integer> l3 = new LinkedList<Integer>();
		 List<Integer> l4 = new LinkedList<Integer>();
		 List<Integer> l5 = new LinkedList<Integer>();
		 
		 l1.add(-1);
		 //l1.add(2);
		 //l1.add(3);
		 //l1.add(4);
		 //l1.add(5);
		 
		 l2.add(2);
		 l2.add(3);
		 //l2.add(33);
		 //l2.add(44);
		 //l2.add(55);
		 
		 l3.add(1);
		 l3.add(-1);
		 l3.add(-3);
		 //l3.add(444);
		 //l3.add(555);
		 
		 //l4.add(1111);
		 //l4.add(2222);
		 //l4.add(3333);
		 //l4.add(4444);
		 //l4.add(5555);
		 
		 //l5.add(11111);
		 //l5.add(22222);
		 //l5.add(33333);
		 //l5.add(44444);
		 //l5.add(55555);
		 
		 List<List<Integer>> parent = new LinkedList<List<Integer>>();
		 parent.add(l1);
		 parent.add(l2);
		 parent.add(l3);
		 parent.add(l3);
		 //parent.add(l4);
		 //parent.add(l5);
		 
		 System.out.println("print list "+(parent));
		 
		 ListIterator iter = parent.listIterator();
		 int sum=0;
		 while(iter.hasNext()){
			 int small=Integer.MAX_VALUE;
			 List<Integer> x = (LinkedList) iter.next(); 
			 ListIterator inner = x.listIterator();
			 while(inner.hasNext()){
				 int a = (Integer) inner.next();
				 
				 small = small < a ? small : a;
			 }
			 System.out.println("min value "+small);
			 sum += small;
		 }
		 System.out.println("sum sum sum sum "+sum);
	}

	public void ArrayListDemo(int[] arr){
	
		/*
		 * how to initialize an array list?
		 * they only allow one object type to be added , so if we want to add a two pair or
		 * more variables we have to create a new class which all fields and can use 
		 * this class's object 
		 * we can use add, we can use addAll.
		 * we can also specify to insert an object at a specific position, by putting an int 
		 * value in the add or addAll call both
		 */
		ArrayList <String> al = new ArrayList <String>();
		al.add("ss");
		al.add(0, "sss");
		System.out.println("size "+al.size());

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("1");
		al2.add("2");
		al2.add("3");
		al2.add(1,"sssss");
		al.addAll(al2);
		al.addAll(3,al2);
		System.out.println("size "+al.size());
		
		al.addAll(Arrays.asList("x1","x2"));
		// return true if inserted else false
		System.out.println("size "+al.size());
		
		al.remove(1); // we can remove using an index
		al.remove("1"); // we can remove a particular object
		// returns element from the list which is removed
		
		al.set(2, "qwqw"); // we can set an element i.e overwrite element at index
		// it will return the previous object
		
		al.indexOf("2"); // returns the index of element passed if found else returns -1
		al.lastIndexOf("2"); // returns the index of element passed from the end if found
		// else returns -1
		
		System.out.println(al.get(4));
		// get accepts index and returns the object at it
		
		// int al.size(); returns size of all
		
		// boolean contains(object) returns true if found else returns false
		
		// void al.clear();  clears all elements of the list
		
		/*
		 * to iterate through a list we can use for for-each while or an iterator
		 * 
		 */
		
		for(int i=0;i<al.size();i++){
			System.out.println("element "+al.get(i));
		}
		System.out.println("element from for-each");
		for(String itt : al){
			System.out.println("element "+itt);	
		}
		int i=0;
		System.out.println("element while loop");
		while(i<al.size()){
			System.out.println("element "+al.get(i));
			i++;
		}
		// the iterator method returns an iterator object for that list
		ListIterator itr = al.listIterator();
		ListIterator itr2 = itr;
		System.out.println("element iterator"+itr);
		
		while(itr2.hasNext()){
			System.out.println("element "+itr2.next());
		}
		/*
		 * SORTING 
		 * it can be achieved by Collections.sort(arrayList);
		 * it will update the invoking list in sorted order
		 * default order is ascending
		 * to get descending order we call:
		 * Collections.sort(arrayList, Collections.reverseOrder());
		 */
		
		
		// to get a sublist
		ArrayList<String> abc = new ArrayList<String>(al.subList(2, 5));
		ListIterator kl = abc.listIterator();
		System.out.println("----------------");
		
		System.out.println("element "+abc);
		
	}
	
	public void HashMapInterface(int[] arr){
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		/*
		 * to initialize we can use put for a single item or for a whole list
		 * put returns the previous value associated with the key else returns null
		 * putAll is void
		 */
		
		hm.put(2, "s");
		System.out.println("get 0 is "+hm.get(0));
		
		hm.put(2, "ss");
		System.out.println("get 0 is "+hm.get(2));
		HashMap ll = new HashMap();
		hm.put(2, "sa");
		System.out.println("get 0 is "+hm.size());
		System.out.println("get 0 is "+hm.get(2));
		ll.putAll(hm);
		
		// int ll.size returns number of elements entered
		System.out.println("size is "+hm.size());
		
		// ll.void.clear() : clears all entries
		
		/*
		 * boolean containsKey(Object o)
		 * returns true if such a key is present else false
		 */
		
		System.out.println("containsKey check "+ll.containsKey(0));
		System.out.println("get "+hm.get(3));
		
		/*
		 * boolean containsValue(Object o)
		 * returns true if such a value is present else false
		 */
		
		System.out.println("containsKey check "+ll.containsValue("ssss"));
		// ther is another method containsKey()
		/*
		 * boolean equals(object o)
		 * returns true if the object is a map and contains all the same entries 
		 * else false
		 * both of the lists must be exactly same
		 */
		
		HashMap ls = new HashMap();
		ls.putAll(ll);
		ls.put(5, "sasasa");
		System.out.println("equals check "+ls.equals(ll));
		
		/*
		 * objrct get(object k)
		 * returns the value associated with key k
		 * if we try to access something that is not yet initialized
		 * we will get null return
		 */
		
		System.out.println("get : "+ls.get(2));
		
		// object remove(object k) : deletes and returns that object equals key
		// object remove(object k, int value) : removes that specific value of that key
		
		hm.replace(1,"a");
		// so it will replace the value associated currently with the key and if no 
		// value is associated it won't be replaced
		// hm.replace(key, old value, new value);
		
		
		
		/*
		 * cant implement values method 
		 * Collection ls.values();
		 * also Set keySet() returns set of keys
		 */

		Set keys = ls.keySet();
		
		for(Object k : keys){
			System.out.println("key and value "+k+" "+ls.get(k));
		}
		
		/*
		 * public int depthSum(List<NestedInteger> nestedList) {
    return helper(nestedList, 1);
}
 
public int helper(List<NestedInteger> nestedList, int depth){
    if(nestedList==null||nestedList.size()==0)
        return 0;
 
    int sum=0;
    for(NestedInteger ni: nestedList){
        if(ni.isInteger()){
            sum += ni.getInteger() * depth;
        }else{
            sum += helper(ni.getList(), depth+1);
        }
    }
 
    return sum;
}
Java Solution 2 - Iterative

public int depthSum(List<NestedInteger> nestedList) {
    int sum=0;
 
    LinkedList<NestedInteger> queue = new LinkedList<NestedInteger>();
    LinkedList<Integer> depth = new LinkedList<Integer>();
 
    for(NestedInteger ni: nestedList){
        queue.offer(ni);
        depth.offer(1);
    }
 
    while(!queue.isEmpty()){
        NestedInteger top = queue.poll();
        int dep = depth.poll();
 
        if(top.isInteger()){
            sum += dep*top.getInteger();
        }else{
            for(NestedInteger ni: top.getList()){
                queue.offer(ni);
                depth.offer(dep+1);
            }
        }
    }
 
    return sum;
}
		 */
	}
}
