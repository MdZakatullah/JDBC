package crudOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestSelect3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			FileInputStream file =new FileInputStream("mydbinfo.properties");
			Properties properties=new Properties();
			properties.load(file);
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			Connection connection=DriverManager.getConnection(url,properties);
			Statement statement=connection.createStatement();
			String sql="SELECT * from student WHERE name='Ritik'";
			ResultSet set=statement.executeQuery(sql);
			while(set.next()) {
				System.out.println(set.getInt(1));
				System.out.println(set.getString(2));
				System.out.println(set.getString(4));
				System.out.println(set.getString(3));
				System.out.println("--------------------------");
			}
	}catch (SQLException | ClassNotFoundException | IOException e) {
		e.printStackTrace();
	}
	}

}
