package studentDataAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDAOImp implements StudentDAO {

	@Override
	public Connection getconnectionUtil() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			String user="root";
			String pass="root";
			return DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String saveStudent(Student student) {
		Connection connection=getconnectionUtil();
		String query="INSERT INTO student (id, name, course, email)"+"VALUES (?,?,?,?)";
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getCourse());
			ps.setString(4, student.getEmail());
			
			int res=ps.executeUpdate();
			connection.close();
			return "no of rows added ="+res;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		return null;
	}

	@Override
	public String deleteStudentByid(int id) {
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		return null;
	}

	@Override
	public List<Student> getAllStudentDetails() {

		
		return null;
	}

}
