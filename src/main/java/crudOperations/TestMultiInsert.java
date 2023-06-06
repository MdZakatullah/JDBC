package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMultiInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			Statement s=connection.createStatement();
			s.addBatch("INSERT INTO student VALUES (100,'Ram','java','ram@gmail.com')");
			s.addBatch("INSERT INTO student VALUES(101,'Ram','java','ram1@gmail.com')");
			s.addBatch("INSERT INTO student VALUES(102,'Ram','java','ram2@gmail.com')");
			
			int [] batch=s.executeBatch();
			
			System.out.println(batch.length);
			
			connection.close();
	}catch (ClassNotFoundException | SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		

}
}
