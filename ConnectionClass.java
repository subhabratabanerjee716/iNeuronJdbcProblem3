package PetsManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionClass {
	
	static boolean f =false;
	static Connection con;
	public static Connection createConnection() throws SQLException {
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user="root";
			String password="1234";
			String url="jdbc:mysql://localhost:3306/pets_management";
			
			 con = DriverManager.getConnection(url,user,password);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;

	}
	
}
