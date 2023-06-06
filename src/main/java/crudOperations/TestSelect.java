package crudOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestSelect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			FileInputStream file =new FileInputStream("mydbinfo.properties");
			Properties properties=new Properties();
			properties.load(file);
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			Connection connection=DriverManager.getConnection(url,properties);
			Statement statement=connection.createStatement();
			String sql="SELECT * from student";
			boolean res=statement.execute(sql);
			System.out.println(res);
			ResultSet rs=statement.getResultSet();
			System.out.println(rs);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println("--------------------------");
			}
			
			connection.close();
			
		} catch (ClassNotFoundException | IOException |SQLException e ) {
			e.printStackTrace();
		}
	}

}
