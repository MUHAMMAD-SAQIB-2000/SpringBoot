package dsa;

import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Value= " +arr[i]+ "is repeated at"
							+ " index="+ i +" and "+ j);
				}
			}
		}
		scan.close();
	}
}
