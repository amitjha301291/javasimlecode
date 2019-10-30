/**
 * 
 */
package com.ds;

import java.util.NoSuchElementException;



/**
 * @author Amit Jha
 * 
 */
public class DoublyLinkedList {

	private DLLNode head;
	private DLLNode tail;
	private int length;

	public DoublyLinkedList() {
		this.tail = null;
		this.head = null;
		this.length = 0;
	}

	public class DLLNode {
		private int data;
		private DLLNode next;
		private DLLNode previous;

		public DLLNode(int data) {
			this.data = data;
		}

		/**
		 * @return the data
		 */
		public int getData() {
			return data;
		}

		/**
		 * @param data
		 *            the data to set
		 */
		public void setData(int data) {
			this.data = data;
		}

		/**
		 * @return the next
		 */
		public DLLNode getNext() {
			return next;
		}

		/**
		 * @param next
		 *            the next to set
		 */
		public void setNext(DLLNode next) {
			this.next = next;
		}

		/**
		 * @return the previous
		 */
		public DLLNode getPrevious() {
			return previous;
		}

		/**
		 * @param previous
		 *            the previous to set
		 */
		public void setPrevious(DLLNode previous) {
			this.previous = previous;
		}

	}

	// Return the current length of DLL
	public int length() {
		return length;
	}

	// check weather node is empty or not
	public boolean isEmpty() {
		return length == 0;
	}

	public void insertHead(int data) {
		DLLNode newNode = new DLLNode(data);
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
  public void insertTail(int data){
	  DLLNode newNode=new DLLNode(data);
	  if(isEmpty()){
		  head=newNode;
	  }
	  else{
		  tail.next=newNode;
		  
	  }
	  newNode.previous=tail;
	  tail=newNode;
	  length++;
  }
  
  public void insert(int data,int position){
	  if(position<0)
		  position=0;
	  if(position>length)
		  position=length;
	  if(head==null)
	  {
		  head=new DLLNode(data);
		  tail=head;
	  }
	  else if(position==length)
	  {
		  insertTail(data);
	  }
	  else if(position==0)
	  {
		  insertHead(data);
	  }
	  else
	  {
		  DLLNode temp=head;
		  for(int i=1;i<position;i++)
		  {
			  temp=temp.getNext();
		  }
		  DLLNode newNode=new DLLNode(data);
		  newNode.next=temp.next;//one way pointing
		  newNode.previous=temp;//one way pointing
		  newNode.next.previous=newNode;//two way pointing
		  temp.next=newNode;//two way pointing
	  }
  }
  
  public void removeHead()
  {
	  DLLNode temp=head;
	  if(isEmpty())
	  {
		  throw new NoSuchElementException();
	  }
	  if(head==tail){// //if head will equal to tail then it's length is 1
		  tail=null;
	  }
	  else
	  {
		head.next.previous=null;  
	  }
	  head=head.next;
	  temp.next=null;
	  length--;
	  
  }
  
  public void removeTail()
  {
	  DLLNode temp=tail;
	  if(isEmpty())
	  {
		  throw new NoSuchElementException();
	  }
	  if(head==tail)
	  {
		  head=null;
	  }
	  else
	  {
		tail.previous.next=null;  
	  }
	  tail=tail.previous;
	  temp.previous=null;
	  length--;
	  
	  
  }
  
  //remove the value at given position
  public void remove(int position)
  {
	  if(position<0)
		  position=0;
	  if(position>=length)
		  position=length;
	  //if nothing inside the list do nothing
	  if(head==null)
		  return;
	  if(position==0)
	  {
		  removeHead();
	  }
	  else if(position==length)
	  {
		  removeTail();
	  }
	  else 
	  {
		  DLLNode temp=head;
		  for(int i=1;i<position;i++)
		  {
			  temp=temp.getNext();
		  }
		  temp.getNext().setPrevious(temp.getPrevious());
		  temp.getPrevious().setNext(temp.getNext());
	  }
	  length--;
	  
  }
  //Remove a node matching the specified node from the list
  public void removeMatched(DLLNode node)
  {
	  DLLNode temp=head;
	  if(head==null)
		  return;
	  if(node.equals(head))
	  {
		  head.next.previous=null;
		  head=head.next;
		  temp.next=null;
		  
	  }
	  else
	  {
		  while(temp!=null)
		  {
			  if(node.equals(temp))
			  {
				  temp.previous.next=temp.next;
				  temp.next.previous=temp.previous;
				  return;
			  }
		  }
		  
	  }
	  
  }
  
  //Remove every thing from DLL
  public void clear()
  {
	  head=null;
	  tail=null;
	  length=0;
  }
  
  
  
  
}


