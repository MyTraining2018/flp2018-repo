package org.cap.demo;

public class SalesClass {
	int[] arr= {1,2,3,-89,56};
	
	public void show() {
	int sum=0;
		for(int i=0;i<arr.length;i++){
		sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(sum);
	}
	
	public void printLoop() {
		for(int i=0;1<100;i++)
			System.out.println(i);
	}

}
