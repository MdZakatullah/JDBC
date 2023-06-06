package dynamicCRUDOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="INSERT INTO student VALUES(?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, 112);
			ps.setString(2, "Raman");
			ps.setString(3, "spring");
			ps.setString(4, "Rama2@gmail.com");
			int res=ps.executeUpdate();
			System.out.println("no of rows added = "+res);
			
			connection.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
