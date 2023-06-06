package dynamicCRUDOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class TestSelect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			String user="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="SELECT * FROM  student WHERE id=?";
			PreparedStatement ps=connection.prepareStatement(query);
			
			ps.setInt(1, 101);
			ResultSet res=ps.executeQuery();
			
			if(res.next()) {
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println(res.getString(4));
				
			}
			connection.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
