package com.sample;

public class TriangleNumbers {

	public static void main(String[] args) {

		int n = Integer.valueOf("9");
		
		int number=1;
/*		for (int i = 1; i < n; i++) {
			int count = 1;
			while (count < n - i) {
				System.out.print("  ");
				count++;
			}
			while(count<n) {
				System.out.print(number++ + " ");
				count++;
			}
			System.out.println();
		}*/
		
		for (int i = 1; i <= n; i++) {
			int count=1;
			while(count<=i) {
				System.out.print(number++);
				count++;
			}
			
			System.out.println();
		}
	}
}
