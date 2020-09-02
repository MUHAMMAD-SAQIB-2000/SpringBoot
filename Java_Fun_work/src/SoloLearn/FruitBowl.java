package SoloLearn;

import java.util.Scanner;

public class FruitBowl {

	private static int numberOfApples;
	private static int numberOfPies;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		driverCode();
	}
	
	public static void driverCode() {
		
		int fruits = 0; 
		
		do {
			System.out.println("Enter Even Number of fruits: ");
			fruits = scan.nextInt();
		}while(!((fruits%2)==0));
		numberOfApples = (fruits/2);
		numberOfPies = (numberOfApples/4);
		System.out.println("Number of Pies we can make is: " + numberOfPies);
		
		
		
	}

	public int getNumberOfApples() {
		return numberOfApples;
	}

	public void setNumberOfApples(int numberOfApples) {
		this.numberOfApples = numberOfApples;
	}

	public int getNumberOfPies() {
		return numberOfPies;
	}

	public void setNumberOfPies(int numberOfPies) {
		this.numberOfPies = numberOfPies;
	}
	
}
