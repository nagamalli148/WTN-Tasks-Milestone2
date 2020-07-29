package com.wipro.collections;


	import java.util.LinkedHashSet;
	public class Linked_hashset {
		public static void main(String[] args) {
			LinkedHashSet<String> hs=new LinkedHashSet<String>();
			hs.add(null);
			hs.add("kk");
			hs.add("kk");
			hs.add("ke");
			for(String s:hs) {
				System.out.println(s);
			}
		}

	}
