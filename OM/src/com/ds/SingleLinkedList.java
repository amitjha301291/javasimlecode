/**
 * 
 */
package com.ds;

/**
 * @author Amit Jha
 *
 */
public class SingleLinkedList {
	
	public SingleLinkedList(int length){
		length=0;
	}
	
     private int length;
     ListNode head;
     
     public void setHead(ListNode head){
    	 this.head=head;
     }
     public  ListNode getHead(){
    	 return head;
     }


	 class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data=data;
		}
		
		public void setData(int data){
			this.data=data;
		}
		public int getData(){
			return data;
		}
		public  void setNext(ListNode next){
			this.next=next;
		}
		public ListNode getNext(){
			return next;
		
		}
	}
	 
	 public int listLength(ListNode headNode){
		 ListNode currentNode=headNode;
		 while(currentNode!=null){
			currentNode= currentNode.getNext();
			 length++;
		 }
		 return length;
	 }
	 
	 public void insertAtBegning(ListNode node){
		 node.setNext(head);
		 head=node;
		 length++;
	 }
	 
	 public void insertAtEnd(ListNode node){
		 if(head==null)
			 head=node;
		 else{
			 ListNode p,q;
			 for(p=head;(q=p.getNext())!=null;p=q){
				 p.setNext(node);
			 }
			 length++;
		 }
	 }
	 
	 //Add a value to the list at given position
	 //move value to the next
	 public void insert(int data,int position){
		 
		 if(position<0)
			 position=0;
		 if(position>length)
			 position=length;
		 if(head==null){
			 head=new ListNode(data);
		 }
		 else if(position==0){
			 ListNode temp=new ListNode(data);
			 temp.next=head;
			 head=temp;
		 }
		 else{
			 ListNode temp=head;
			 for(int i=1;i<position;i++){
				temp= temp.getNext();
			 }
			 ListNode newNode=new ListNode(data);
			 newNode.next=temp.next;
			 temp.setNext(newNode);
			 
		 }
		 length+=1;
	 }
	 
	 public ListNode removeFromBegin(){
		 ListNode temp=head;
		 if(temp!=null){
		 head=temp.next;
		 temp.setNext(null);
		 }
		 return temp;
	 }
	 
	 public ListNode removeFromEnd(){
		 
		 if(head==null)
			 return null;
		 ListNode p=head,q=null,next=head.getNext();
		 if(next==null){
			 head=null;
			 return p;
		 }
		 
		 while((next=p.getNext())!=null){
			 q=p;
			 p=next;
		 }
		 q.setNext(null);
		 
		 length--;
		 return p;
	 }
	 
	 //Remove a node matching a specified node from a list
	 //use equals instead of == to test for a matched node
	 
	 public void removeMatched(ListNode node){
		 if(head==null)
			 return;
		 if(node.equals(head)){
			 head=head.next;
			 return;
			 }
		 ListNode p=head,q=null;
		 while((q=p.getNext())!=null){
			 if(node.equals(q)){
				 p.setNext(q.getNext());
				 return;
			 }
			 p=q;
		 }
	 }
	 
	 //Remove the value at a given position 
	 
	 public void remove(int position){
		 if(position<0)
			 position=0;
		 if(position>=length)
			 position=length-1;
		 if(head==null)
			 return;
		 if(position==0){
			 head=head.getNext();
		 }
		 else{
			 ListNode temp=head;
			 for(int i=1;i<position;i++){
				 temp=temp.getNext();
			 }
			 temp.setNext(temp.getNext().getNext());//we will break the link b/w next
		 }
		 length-=1;
		 
	 }
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result="[";
		if (head==null){
			return result+"]";
		}
		result=result+head.getData();
		ListNode temp=head.getNext();
		while (temp!=null){
			result=result+","+temp.getData();
			temp=temp.getNext();
		}
		return result+"]";
	}
	
	public int length(){
		return length;
	}
	
	//Remove every thing from the list
	public void clear(){
		head=null;
		length=0;
	}
	
	public int getPosition(int data){
		ListNode temp=head;
		int position=0;
		while(temp.getNext()!=null)
		{
			if(temp.getData()==data){
				return position;
			}
			position++;
			temp.getNext();
		}
		return Integer.MIN_VALUE;
	}
	
	
	 

}
