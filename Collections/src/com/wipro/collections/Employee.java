//Linked List in collection

package com.wipro.collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Employee {
private int empno;
private String empname;
private double Salary;
Employee(int empno,String empname,double salary){
	this.empno=empno;
	this.empname=empname;
	this.Salary=salary;
}
	public static void main(String[] args) {

		Employee e1=new Employee(101,"nm",5000);
		Employee e2=new Employee(102,"kh",49430);
		Employee e3=new Employee(234,"nk",4500);
		LinkedList<Employee> ll=new LinkedList();
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		//Now , I need to retrive the data from the respective collection
		
		Iterator<Employee> i=ll.iterator();
		Employee e;
			while(i.hasNext()) {
				//System.out.println(i.next()+" "+i.next()); //Gives the address of first and next values
				e=i.next();
				System.out.println(e.empname+" "+e.empno+ " "+e.Salary);
			}
		}
		
		
	}

