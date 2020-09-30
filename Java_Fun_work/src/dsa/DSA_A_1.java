package dsa;

import java.util.Scanner;

public class DSA_A_1 {
	
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner scan = new Scanner(System.in);
		int temp;
		for (int i=0 ; i<a.length ; i++) {
			System.out.println("Enter value at index "+ i);
			temp = scan.nextInt();
			a[i] = temp;
			for (int j=0 ; j<i ; j++) {
				if((temp==a[j])) {
					while(temp==a[j]) {
						System.out.println("Same input! enter again");
						temp = scan.nextInt();
						a[i] = temp;
					}
				}
			}
		}
		for( int k : a) {
			System.out.println(k);
		}
	}

}
