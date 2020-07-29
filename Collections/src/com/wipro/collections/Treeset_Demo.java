package com.wipro.collections;

	import java.util.TreeSet;
	public class Treeset_Demo {
		public static void main(String[] args) {
			TreeSet<String> hs=new TreeSet<String>();
			//hs.add(null);
			hs.add("kk");
			hs.add("kk");
			hs.add("ke");
			for(String s:hs) {
				System.out.println(s);
			}
		}

	}