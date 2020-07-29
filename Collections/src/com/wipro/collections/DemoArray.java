//Arraylist with wrappwe class
package com.wipro.collections;

import java.util.ArrayList;

public class DemoArray {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList(); //al is a collection which is going to store the values as a string
	//insert
	al.add(12);
	al.add(13);
	//al.add("think");
	//System.out.println(al.get(0));
	
	//Iteration
	/*
	 * 1.Iterator
	 * 2.ListIterator
	 * 3.For Loop
	 * 4.For each
	 */
	/*1.
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	*/
	
	/*2.foreach loop
	
	for(int i:al) {   //collection supports boxing
		System.out.println(i);
	}
	*/
	
	/*3.Iterator
	
	Iterator<Integer> i=al.iterator();
	while(i.hasNext()) {             //hasNext(boolean) checks Address and Value in the location it's exists or not
	System.out.println(i.next());   //gets the value from the address and 
	//incrementing to the next location
	}
*/

/*3.Iterator
	
	ListIterator<Integer> i=al.listIterator(); both backward and forward
	syso(i);
	while(i.hasNext()) {  //hasNext(boolean) checks Address and Value in the location it's exists or not
	System.out.println(i.next()); //gets the value from the address and 
	//incrementing to the next location
	 * 
	 * while(i.prevNext()){
	 * syso(i.prev()11);
	}
*/
	
}
}