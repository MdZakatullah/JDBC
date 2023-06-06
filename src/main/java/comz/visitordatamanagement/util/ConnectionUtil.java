package comz.visitordatamanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection connectionGiver() {
		try {
			Class.forName(AppConstatnts.Driver);
			return DriverManager.getConnection
					(AppConstatnts.URL, AppConstatnts.USER, AppConstatnts.PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}  
		return null;
	}
}
