package leetcode;

import java.util.Scanner;

public class RomanToInteger {
	
	public static long checkSymbol(char[] arr) {
		long sum = 0;
		int counter = 0;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] == 'i' || arr[i] == 'I') {
				sum += 1;
				
			} 
			else if(arr[i] == 'v' || arr[i] == 'V') {
				if(counter>=1) {
					if(arr[i-1] == 'i' || arr[i-1] == 'I') {
						sum += 3;
					}else {
						sum += 5;
					}
				}else {
					sum += 5;
				}
				
			} 
			else if(arr[i] == 'x' || arr[i] == 'X') {
				if(counter>=1) {
					if(arr[i-1] == 'i' || arr[i-1] == 'I') {
					sum += 8;
					}else {
						sum += 10;
					}
					
				}else {
					sum += 10;
				}
				
			}
			else if(arr[i] == 'l' || arr[i] == 'L') {
				if(counter>=1) {
					if(arr[i-1] == 'x' || arr[i-1] == 'X') {
					sum += 30;
					}else {
						sum += 50;
					}
				}else {
					sum += 50;
				}
				
			}
			else if(arr[i] == 'c' || arr[i] == 'C') {
				if(counter>=1) {
					if(arr[i-1] == 'x' || arr[i-1] == 'X') {
					sum += 80;
					}else {
						sum += 100;
					}
				}else {
					sum += 100;
				}
				
			} 
			else if(arr[i] == 'd' || arr[i] == 'D') {
				if(counter>=1) {
					if(arr[i-1] == 'c' || arr[i-1] == 'C') {
					sum += 300;
					}else {
						sum += 500;
					}
				}else {
					sum += 500;
				}
				
			}
			else if(arr[i] == 'm' || arr[i] == 'M') {
				if(counter>=1) {
					if(arr[i-1] == 'c' || arr[i-1] == 'C') {
					sum += 800;
					}else {
						sum += 1000;
					}
				}else {
					sum += 1000;
				}
				
			}
			else {
				sum += 0;
			} 
			counter++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = " ";
		int n  = 1;
		System.out.println("How many input to you want to Give?: ");
		//n = scan.nextInt();
		for(int i=0 ; i<n ; i++) {
			System.out.println("Enter Your Roman Value: ");
			//scan.nextLine();
			temp = scan.nextLine();
			char[] romanValue = temp.toCharArray();
			long result = checkSymbol(romanValue);
			System.out.println("Value in decimal is: " + result);
		}
		scan.close();
		
	}

}
