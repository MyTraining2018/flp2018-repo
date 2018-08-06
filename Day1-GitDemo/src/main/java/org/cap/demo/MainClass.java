package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		SalesClass class1=new SalesClass();
		
		System.out.println("Hello World!");
		greet();
		class1.show();
		class1.printLoop();
		printAll();
	}

	
	public static void greet() {
		System.out.println("Hello");
		System.out.println("Good Morning");
	}
	
	public static void printAll() {
		System.out.println("Hey! Good AfterNoon!");
		System.out.println("Tom");
		
	}
	
}
