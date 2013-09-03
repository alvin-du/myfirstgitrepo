package com.djy.citi.entity;
/**
 * @author : Alvin Du
 * date    : 2012-8-5
 */
public class InsertionArray {
	
	private double[] array;
	private int nElems;
	
	//constructor
	public InsertionArray(int length) {
		array = new double[length];
		nElems = 0;
	}
	
	//insert method to insert elem into array
	public void insert(double elem) {
		array[nElems] = elem;
		nElems++;
	}
	
	//sort method. 
	public void sort(){
		for(int out=1;out<nElems;out++){
			int in=out;
			double temp = array[out];
			while (in>0&&array[in-1]>temp) {
				array[in] = array[in-1];
				--in;
			}
			array[in]=temp;
		}
	}
	
	//to print elem in array
	public void display(){
		for (int curr = 0; curr < nElems; curr++) {
			System.out.print(array[curr]+" ");
			
		}
	}

}

