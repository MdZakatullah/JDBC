package crudOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestDelete {
	public static void main(String[] args) {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream file =new FileInputStream("mydbinfo.properties");
			Properties properties=new Properties();
			properties.load(file);
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			Connection connection=DriverManager.getConnection(url,properties);
			Statement statement=connection.createStatement();
			String sql="DELETE FROM student WHERE name='Legain'";
			int res=statement.executeUpdate(sql);
			System.out.println("no of rows deleted = "+res);
			connection.close();
			
		}catch (SQLException | IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	}


