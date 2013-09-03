package com.djy.citi.algorithm;

import com.djy.citi.entity.Link;

/**
 * @author : Alvin Du
 * date    : 2012-8-10
 */
public class LinkList {
	
	private Link first;

	//constructor
	public LinkList() {
		first = null;
	}

	//insert first link node
	public void insertFirst(int data){
		Link newLink = new Link(data);
		if(isEmpty()){
			first = newLink;
		}else {
			//point newLink to first but not first.next
			newLink.setNext(first);
			first = newLink;
		}
	}
	
	public int deleteFirst(){
		Link temp = first;
		int result = 0;
		if(temp!=null){
			first = first.getNext();
			result = temp.getData();
		}
		
		return result;
	}
	
	//display link list
	public void displayLinkList(){
		System.out.println("print link list:");
		Link current = first;
		while(current!=null){
			current.display();
			current = current.getNext();
		}
	}
	
	//whether linklist is empty
	public boolean isEmpty(){
		return (first==null);
	}
	
	//find elem by key
	public Link find(int key){
		Link current = first;
		while(current!=null){
			if(key==current.getData()){
				System.out.println("find"+key);
				break;
			}
			current = current.getNext();
		}
		return current;
	}
	
	//delete element by key
	public Link delete(int key){
		Link previous = null;
		Link current = first;
		while(current!=null){
			if(key==current.getData()){
				break;
			}
			previous = current;
			current = current.getNext();
		}
		
//		if(previous==null){
//			first = first.getNext();
//		}
		if(current==first){    // first is the elem to find
			first = first.getNext();
		}else{
			previous.setNext(current.getNext());
		}
		return current;
	}
	
	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}
	
	

}

