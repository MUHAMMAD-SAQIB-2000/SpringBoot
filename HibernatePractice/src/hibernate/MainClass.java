package hibernate;

import java.util.Scanner;

public class MainClass 
{
	
	public static void main(String[] args) throws Exception{
		char ch ;
		Scanner input = new Scanner(System.in);
		System.out.println("1. Display All");
		System.out.println("2. Insert Data");
		System.out.println("3. Delete Data");
		System.out.println("4. Update Data");
		
		do {
			System.out.println("Enter your choice: ");
			ch = input.next().charAt(0);
			switch(ch){
				case '1':
					FunctionClass.displayAll();
					break;
				case '2':
					FunctionClass.insertData();
					break;
				case '3':
					FunctionClass.delData();
					break;
				case '4':
					FunctionClass.updateData();
					break;
				default:
					System.out.println("Invalid input ");
					break;
			}
		}while(!(ch=='1'||ch=='2'||ch=='3'||ch=='4'));
		input.close();
	}
	

}
