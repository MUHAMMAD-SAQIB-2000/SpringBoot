package hibernate;

import java.sql.*;
import java.util.Scanner;

public class FunctionClass {
	static Connection con;
	static Scanner scan;
	public static void updateData() throws Exception{
		connect();
		
		Scanner input = new Scanner(System.in);
		int id = 0;
		String newName = "default name";
		
		System.out.println("Enter Id number Whose Data is to be updated: ");
		id = input.nextInt();
		System.out.println("Enter New Name: ");
		newName = input.nextLine();
		newName += input.nextLine();
		
		String query = "update students Set uname = ? where book_id = " + id ;
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, newName);
		st.executeUpdate();
		
		System.out.println("Data Updated!");
		displayAll();
		
		st.close();
		input.close();
	}
	public static void delData() throws Exception{
		connect();
		int id = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Id Number to be Deleted!!");
		id = input.nextInt();
		
		String query = "delete from students where book_id = "+id;
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Data Deleted");
		st.close();
		displayAll();
		input.close();
	}
	public static void insertData() throws Exception{
		scan = new Scanner(System.in);
		connect();
		
		
		String usname = "saqib";
		System.out.println("Enter Name to Be Added in DataBase: ");
		usname = scan.nextLine();
		
		String query;
		query = "ALTER TABLE students AUTO_INCREMENT=001";
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		query = "insert into students value (? , ?)";
		PreparedStatement rps = con.prepareStatement(query);
		
		rps.setInt(1, setId());
		//rps.setInt(1, count);
		rps.setString(2, usname);
		rps.executeUpdate();
		
		System.out.println("The Name: " + usname + " with ID = "+ count +" has been added to DataBase." );
		rps.close();
		
		System.out.println("Data After Insertion:");
		displayAll();
	}
	public static void displayAll() throws Exception{
		connect();
		String query = "select * from students";
		String data;

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		System.out.println("ID" +" "+"Name");
		while(rs.next()) {
			data = rs.getInt("book_id") + " " + rs.getString("uname");
			System.out.println(data);
		}
		
		rs.close();
		con.close();
	}	
	public static int setId() throws Exception{
		connect();
		String query = "select * from students";
		int ID = 1;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		int counter = 1;
		while(rs.next()) {
			ID = rs.getInt("book_id");
			if(!(ID == counter)) {
				return counter;
			}
			counter++;
		}
		if(ID<1) {
			return ID;
		}else {
			ID++;
		}
		rs.close();
		return ID;
	}
	public static void connect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/aliens?useSSL=false", "root", "saqibsql");
	}
}
