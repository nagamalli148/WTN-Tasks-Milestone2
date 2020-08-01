package com.wipro.multithreading;

public class Assignment1 {
public static void main(String[] args) {
	Thread t1=new Thread("Scooby") {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread is running.......");
	}
};

Thread t2=new Thread("Shaggy") {

@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	System.out.println("Thread is running.......");

}
};

t1.start();
t2.start();
}
}
