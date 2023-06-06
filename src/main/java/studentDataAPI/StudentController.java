package studentDataAPI;

import java.sql.Connection;

public class StudentController {
	public static void main(String[] args) {
		StudentDAO dao= new StudentDAOImp();
		Student student=new Student();
		student.setId(101);
		student.setName("kamran");
		student.setCourse("php");
		student.setEmail("kamran101@gmail.com");
		System.out.println(dao.saveStudent(student));
		
	}

}
