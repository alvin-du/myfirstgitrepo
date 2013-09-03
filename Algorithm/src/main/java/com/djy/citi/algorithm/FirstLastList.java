package com.djy.citi.algorithm;

import com.djy.citi.entity.Link;

/**
 * @author : Alvin Du
 * date    : 2012-8-10
 *fist last link
 */
public class FirstLastList {

	private Link first;
	private Link last;
	
	//constructor
	public FirstLastList(){
		first = null;
		last = null;
	}
	
	//check first_last_link is empty
	public boolean isEmpty(){
		return (first==null);
	}
	
	//insert first 
	public void insertFirst(int data){
		Link newLink = new Link(data);
		if(isEmpty()){
			first = newLink;
			last = newLink;
		}else {
			//note , here newLink point to old first
			newLink.setNext(first);
			first= newLink;
		}
	}
	
	//insert last
	public void insertLast(int data){
		Link newLink = new Link(data);
		if(isEmpty()){
			first = newLink;
			last = newLink;
		}else {
			last.setNext(newLink);
			last = newLink;
		}
	}
	
	//delete first
	public int deleteFirst(){
		Link current = first;
		if(first.getNext()==null){
			last = null;
		}
		first = first.getNext();
		return current.getData();
	}
	
	//delete last
	public int deleteLast(){
		int result = -1;
		Link current = first;
		Link previous = null;
		if(last==first){
			first = null;
		}
		
		while(current!=null){
			if(current==last){
				break;
			}
			previous = current;
			current = current.getNext();
		}
		
		if(previous!=null){
			previous.setNext(null);
			last = previous;
		}
		
		if(current!=null){
			result = current.getData();
		}
		return result;
		
	}
	
	//display elems
	public void displayList(){
		System.out.println("display first last list:");
		Link current = first;
		while(current!=null){
			current.display();
			current = current.getNext();
		}
	}
}

