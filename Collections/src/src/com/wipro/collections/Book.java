package src.com.wipro.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
private int bookid;
private String bookname;
Book(int bookid,String bookname){
	this.bookid=bookid;
	this.bookname=bookname;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(101,"java");
		Book b2=new Book(102,"C");
		Book b3=new Book(103,"python");
		
		ArrayList<Book> bb=new ArrayList<>();
		bb.add(b1);
		bb.add(b2);
		bb.add(b3);
		Book bz;
		Iterator<Book> i=bb.iterator();
		while(i.hasNext());
		{
			bz=i.next();
			System.out.println(bz.bookid+" "+bz.bookname);
		}

	}

}
