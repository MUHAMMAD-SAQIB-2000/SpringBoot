
public class MainClass {
	
	public static void main(String[] args) throws Exception
	{
		
		StudentDAO dao = new StudentDAO();
		Student s = dao.getStudent(15);
		System.out.println(s.name);
		
		
		Student sadd = new Student();
		sadd.rollno = 15;
		sadd.name = "Muhammad Saqib";
		StudentDAO.addStudent(sadd);
		
		
	}

}
