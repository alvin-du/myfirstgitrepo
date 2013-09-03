package com.djy.citi.exercise;

import com.djy.citi.algorithm.LinkList;
import com.djy.citi.entity.Link;

/**
 * @author : Alvin Du
 * date    : 2012-8-10
 */
public class LinkListApp {

	/**
	 * author : 杜超
	 * date   : 2012-8-10
	 *
	 */
	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		
		linkList.displayLinkList();
		
		linkList.insertFirst(1);
		linkList.insertFirst(2);
		linkList.insertFirst(3);
		linkList.insertFirst(4);
		linkList.insertFirst(5);
		
		linkList.displayLinkList();
		
		linkList.deleteFirst();
		linkList.deleteFirst();
		
		linkList.displayLinkList();
		
		while (!linkList.isEmpty()) {
			int data = linkList.deleteFirst();
			System.out.println("delted:"+data);
		}
		
		linkList.displayLinkList();
		
		
		linkList.insertFirst(6);
		linkList.insertFirst(7);
		linkList.insertFirst(36);
		linkList.insertFirst(45);
		linkList.insertFirst(54);
		
		Link link = linkList.find(36);
		
		if(link==null){
			System.out.println("not found");
		}else {
			link.display();
		}
		
		linkList.displayLinkList();
		
		link = linkList.delete(54);
		
		link.display();
		
		linkList.displayLinkList();
		
		
	}

}

