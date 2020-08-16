import java.sql.*;

public class StudentDAO {
	
	public Student getStudent(int rollnumber) throws Exception{
		
		Student s = new Student();

		String query = "select uname from students where book_id ="+ rollnumber;
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aliens?useSSL=false", "root", "saqibsql");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String DataRetrievd = rs.getString(1);
		s.name = DataRetrievd;
		st.close();
		con.close();
		
		return s;
		
	}
	
	public static void addStudent(Student s) throws Exception {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aliens?useSSL=false", "root", "saqibsql");
		
		String query = "insert into students values (?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, s.rollno);
		pst.setString(2, s.name);
		pst.executeUpdate();
		pst.close();
		con.close();
		
	}
}









