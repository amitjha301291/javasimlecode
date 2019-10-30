package com.ds.my;

import java.util.NoSuchElementException;

public class DoubleLinkedListIm<Element> {
	private ListNode tail;
	private ListNode head;
	private int length;
	public DoubleLinkedListIm(){
		this.tail=null;
		this.head=null;
		this.length=0;
	}
	
	//Creating class for ListNode which will have three fields data with next and previous node;
	private class ListNode{
		private ListNode next;
		private ListNode previous;
		private Element data;  // Taking data as Generic type
		
		public ListNode(Element data){
			this.data=data;
			
		}
	}
	
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public int size(){
		return length;
	}
	
	public void displayForwar(){
		if(head==null){
			System.out.print("null");
			return;
			}
		ListNode temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	public void displayBackword(){
		if(tail==null){
			System.out.println("null");
			return;
		}
		
		ListNode temp=tail;
		while(temp!=null){
			System.out.println(temp.data+" ");
			temp=temp.previous;
			
		}
		
	}
	
	public void addFirst(Element e){
		
		ListNode newNode=new ListNode(e);
		if(isEmpty()){
			tail=newNode;
		}
		else{
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
	
	public void addLast(Element e){
		ListNode newNode=new ListNode(e);
		if(isEmpty()){
			head=newNode;
		}
		else{
			tail.next=newNode;
			newNode.previous=tail;
		}
		
		tail=newNode;
		length++;
	}
	
	public ListNode deleteFirst(Element e){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		ListNode temp=head;
		if(head==tail){   //if head will equal to tail then it's length is 1
			tail=null;
			
		}
		else{
			head.next.previous=null;
			
		}
		head=head.next;
		temp.next=null;
		length--;
		return temp;
	}
	
	public ListNode deleteLast(Element e){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		ListNode temp=tail;
		if(head==tail){
			head=null;
		}
		else{
			tail.previous.next=null;
			tail=tail.previous;
			temp.next=null;
			length--;
			
		}
		return temp;
		
	}

	public static void main(String[] args) {
		DoubleLinkedListIm<Integer> dl=new DoubleLinkedListIm<Integer>();
		dl.addFirst(1);
		dl.addFirst(10);
		dl.addLast(20);
		dl.displayForwar();
		dl.displayBackword();

	}

}
