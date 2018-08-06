package org.cap.demo;

public class SalesClass {
	int[] arr= {1,2,3,-89,56};
	
	public void show() {
		int sum=0;
		for(int num:arr) {
			sum+=num;
			System.out.println(num);
		}
		System.out.println(sum);
	}
	
	public void printLoop() {
		for(int i=0;1<100;i++)
			System.out.println(i);
	}

}
