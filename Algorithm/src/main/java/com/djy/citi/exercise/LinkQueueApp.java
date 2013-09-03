package com.djy.citi.exercise;

import com.djy.citi.algorithm.LinkQueue;

/**
 * @author : Alvin Du
 * date    : 2012-8-11
 */
public class LinkQueueApp {

	/**
	 * author : 杜超
	 * date   : 2012-8-11
	 *
	 */
	public static void main(String[] args) {

		LinkQueue linkQueue = new LinkQueue();
		
		linkQueue.insert(11);
		linkQueue.insert(22);
		linkQueue.insert(33);
		linkQueue.insert(44);
		linkQueue.insert(55);
		
		linkQueue.display();
		
		linkQueue.remove();
		linkQueue.remove();
		linkQueue.remove();
		
		linkQueue.display();
	}

}

