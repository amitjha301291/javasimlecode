/**
 * 
 */
package com.ds.my;

import java.util.EmptyStackException;

/**
 * @author Amit Jha
 *
 */
public class LinkedStack<Element> {

	private int length;
	private ListNode top;
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public int size(){
		
		return length;
	}
	
	public void push(Element data){
		ListNode temp=new ListNode(data);
		temp.setNext(top);
		top=temp;
		length++;
		
	}
	//return top of the stack
	public Element peek() throws EmptyStackException{
		if(isEmpty())
			throw new EmptyStackException();
		return top.getData();
	}
	
	public Element pop()throws EmptyStackException{
		if(isEmpty())
			throw new EmptyStackException();
		Element data1=top.getData();
		top=top.getNext();
		length--;
		return data1;
	}
	public class ListNode{
		private Element data;
		private ListNode next;
		
		
		public ListNode(Element data) {
			this.data=data;
		}
		
		public void setData(Element data) {
			this.data = data;
		}
		
		public Element getData() {
			return data;
		}
		
		public void setNext(ListNode next) {
			this.next = next;
		}
		
		public ListNode getNext() {
			return next;
		}
	}
	
	public String toString(){
		String result="";
		ListNode current=top;
		while(current!=null){
			result=result+" "+current.getData();
			current=current.getNext();
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		LinkedStack<String> stack=new LinkedStack<String>();
		stack.push("Amit");
		stack.push("Kumar");
		stack.push("Jha");
		System.out.println(stack.peek());
		System.out.println(stack);
		

	}

}
