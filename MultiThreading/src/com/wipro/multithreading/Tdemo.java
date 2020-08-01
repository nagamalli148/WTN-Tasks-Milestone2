/*store colours in the form of an array ex: String colours[]=
 * {"white","blue","black","green","red","yellow"};display all
 * colours repeatedly by generating colour index from Random 
 * class.If the random colour index matches to red stop display.
 * Note: perform this task by implementing Runnabe interface
*/
package com.wipro.multithreading;
import java.util.Random;
public class Tdemo implements Runnable {
	@Override
	public void run() {
	String colours[]={"white","blue","black","green","red","yellow"};
	Random random=new Random();
	int index;
	while((index=random.nextInt(6)) !=4){
		System.out.println(colours[index]);
	}
}
public static void main(String args[]) {
		Tdemo threadDemo = new Tdemo();
		Thread t1=new Thread(threadDemo);
		t1.start();
	}
}