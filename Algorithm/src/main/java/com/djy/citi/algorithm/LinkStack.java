package com.djy.citi.algorithm;


/**
 * @author : Alvin Du
 * date    : 2012-8-11
 * 用链表实现栈
 */
public class LinkStack {
	
	private LinkList linkList;
	
	//constructor
	public LinkStack(){
		linkList = new LinkList();
	}
	
	//push
	public void push(int data){
		linkList.insertFirst(data);
	}
	
	//pop
	public int pop(){
		int data = linkList.deleteFirst();
		return data;
	}

	//is empty
	public boolean isEmpty(){
		return (linkList==null);
	}
	
	public void displayStack(){
		linkList.displayLinkList();
	}
}

