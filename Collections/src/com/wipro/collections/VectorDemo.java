package com.wipro.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector<String> v=new Vector<>();
	v.add("kk");
	v.add("pp");
	Enumeration e=v.elements();
	/*
	System.out.println(e);
	Iterator i=v.iterator();
	System.out.println(e+"  "+i);
	*/
	/*
	while(e.hasMoreElements()) {
		System.out.println("Before");
		System.out.println(e.nextElement());
	}
	*/
	v.remove(0);
	while(e.hasMoreElements()) {
		System.out.println("after");
		System.out.println(e.nextElement());
	}
	System.out.println(v);
}
}