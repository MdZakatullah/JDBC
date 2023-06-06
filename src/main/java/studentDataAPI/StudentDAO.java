package studentDataAPI;

import java.sql.Connection;
import java.util.List;

public interface StudentDAO {
	
	Connection getconnectionUtil();
	
	String saveStudent(Student student);
	
	String updateStudent(Student student);
	
	String deleteStudentByid(int id);
	
	Student getStudentById(int id);
	
	List<Student> getAllStudentDetails();
	
	
	
}
