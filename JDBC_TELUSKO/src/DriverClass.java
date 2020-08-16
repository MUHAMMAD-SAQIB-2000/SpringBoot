import java.sql.*;

public class DriverClass 
{
	public static void runSetup() throws Exception{
		String url,username,pass,query;
		url = "jdbc:mysql://localhost/aliens?useSSL=false";
		username = "root";
		pass = "saqibsql";
		//query = "select uname from students where book_id = 1";
		query = "select * from students ";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			String name = rs.getString("uname");
			System.out.println(name);
		}
		
		st.close();
		con.close();
	}
	
	public static void allDataDisplay() throws Exception {
		String url,username,pass,query;
		url = "jdbc:mysql://localhost/aliens?useSSL=false";
		username = "root";
		pass = "saqibsql";
		//query = "select uname from students where book_id = 1";
		query = "select * from students ";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		System.out.println("Displaying data base with Id and Name:");
		while(rs.next()) {
			String UserData = rs.getInt(1) + " , " +rs.getString(2);
			System.out.println(UserData);
		}
		
		st.close();
		con.close();
	}
	
	public static void insertData() throws Exception {
		System.out.println("Inserting data normally");
		String url,username,pass;
		url = "jdbc:mysql://localhost/aliens?useSSL=false";
		username = "root";
		pass = "saqibsql";
		String queryInsert = "insert into students value (6 , 'sidra naseem' )";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, pass);
		
		Statement st = con.createStatement();
		int count = st.executeUpdate(queryInsert);
		System.out.println(count + "row(s) affected");
		
		String usname = "asma";
		int userid = 7;
		queryInsert = "insert into students value (" + userid +",'" + usname+ "')";
		
		st = con.createStatement();
		count = st.executeUpdate(queryInsert);
		System.out.println(count + "row(s) affected");
		
		st.close();
		con.close();
	
	}
	public static void insertDataPstatement() throws Exception {
		System.out.println("Inserting data using Prepared Statement");
		String url,username,pass;
		url = "jdbc:mysql://localhost/aliens?useSSL=false";
		username = "root";
		pass = "saqibsql";
		
		int userid = 9;
		String usname = "ashfaq";
		String queryInsert = "insert into students value (?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, pass);
		PreparedStatement st = con.prepareStatement(queryInsert);
		
		st.setInt(1, userid);
		st.setString(2, usname);
		
		int count = st.executeUpdate();
		System.out.println(count + "row(s) affected");
		
		allDataDisplay();
		
		st.close();
		con.close();
	
	}


}
