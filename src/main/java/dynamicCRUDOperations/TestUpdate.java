package dynamicCRUDOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="UPDATE student SET name=? WHERE id=?";
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, "pema");
			ps.setInt(2, 100);
			int res=ps.executeUpdate();
			System.out.println("no of data updated = "+res);
			
			connection.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
