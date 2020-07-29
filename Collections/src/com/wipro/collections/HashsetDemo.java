package com.wipro.collections;
import java.util.HashSet;
public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add(null);
		hs.add("kk");
		hs.add("kk");
		hs.add("ke");
		for(String s:hs) {
			System.out.println(s);
		}
	}

}
