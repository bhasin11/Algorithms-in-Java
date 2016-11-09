/*
Given a linked list, check if it is palindrome or not.

*/


public boolean checkPalindrome(Node head){
		
	if(head==null) return false;
	Node fast=head, slow=head, newHead=null, temp=null;
	
	while(fast.next != null && fast.next.next!=null){
		fast = fast.next.next;
		slow=slow.next;
		
		Node newLink = new Node("",slow.age);
		newLink.next = newHead;
		newHead=newLink;
	}
	
	temp = newHead;
	fast=slow.next;
	
	if(fast.next==null) temp=temp.next;
	
	while(fast.next != null){
		if(temp.age != fast.age) return false;
		temp=temp.next;
		fast=fast.next;
	}
	
	return true;
}

/*
// other approaches


/*
		 * first we will find the middle of the list. while finding the mid, we 
		 * will also pushing each node to the stack
		 * later we will move through the stack and to rest of elements after mid
		 * and if we find that any 2 elements aren't equal we will return false
		 
		boolean flag=true;
		arr= new int[100];
		Node temp=head, mid=null;
		
		if(temp!=null){ // check if list is not null, if not put mid to first element
			mid=head;
			push(mid); // put first element in stack
			while(temp.next!=null && temp.next.next!=null){ // find mid
				mid=mid.next; // new mid
				push(mid); // put new mid to stack
				temp=temp.next.next;
			}
			if(temp.next!=null){ // if total elements are even we have to compare current
				// mid and elements next to mid
				mid=mid.next;
				while(mid !=null){
					if(mid.age != arr[top--]) flag=false;
					mid=mid.next;
				}
			}
			else{ // if total elements are odd we don't need to compare current mid
				// so we start comparisons from one element next to mid and one 
				// element before mid
				top--;
				mid=mid.next;
				while(mid!=null){
					if(mid.age != arr[top--]) flag=false;
					mid=mid.next;
				}
			}
		}
		System.out.println("ans"+flag);
		*/
		
		
		/*
		 // solution 2: first find mid, then reverse first half and then start comparing 
		 boolean flag=true;
        if(head==null || head.next==null) flag=true;
        
        else{
            Node mid=null, temp = head, temp2=head;
            mid=temp;
            while(temp.next !=null && temp.next.next!=null){
                mid=mid.next;
                temp=temp.next.next;
            }
            
            temp=mid.next;
            Node previousNode=null, currentNode=temp, nextNode=null;
        
            while(currentNode != null){
                nextNode=currentNode.next;
                currentNode.next=previousNode;
                previousNode=currentNode;
                currentNode=nextNode;
            }
            System.out.println("current age "+previousNode.age);
            System.out.println("current age "+previousNode.next.age);
    		
            System.out.println("heead age "+temp2.age);
            System.out.println("head age "+temp2.next.age);
    		
            temp=previousNode;
            while(temp != null){
                if(temp2.age != temp.age){
                	System.out.println("temp2 and temp "+temp2.age+" "+temp.age);
                    System.out.println("current age while");

                    flag= false;
                }
                System.out.println("out while");
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        System.out.println("flag "+flag);;
		 */
		
		/*
		 * boolean flag=false;
		 
		Node mid = findMiddle(r);
		//System.out.println("mid "+mid.age);
		
		Node temp= reverse(mid.next);
		System.out.println("1");
		
		while(temp != null){
			System.out.println("1");
			System.out.println("age "+temp.age);
			temp=temp.next;
		}
		
		
		while(temp != null){
			if(r.age != temp.age){
				flag=true;
				break;
			}
			r=r.next;
			temp=temp.next;
		}
		
		if(flag)		System.out.println("nope");
		else		System.out.println("yes");
		*/



*/