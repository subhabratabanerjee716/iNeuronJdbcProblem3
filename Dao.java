package PetsManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	static boolean f =false;
	public static boolean insertOwnerAndPet(Pets_owner po,pets p) {
		
		try {
			Connection con = connectionClass.createConnection();
			
			String sql="insert into pets_owner (owner_name) values('?');";
			
			PreparedStatement  pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1,po.getOwner_name());
			
			pstmt.executeUpdate();
			
			String sql1="insert into pets (pet_name,pet_cat,owner_id) values(?,?,?);";
			
			PreparedStatement  pstmt1=con.prepareStatement(sql1);
			
			pstmt1.setString(1,p.getPet_name());
			pstmt1.setString(2,p.getPet_cat());
			pstmt1.setInt(3,p.getOwner_id());
			
			pstmt1.executeUpdate();
			
			f=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
		
	}
	
	public static void select()   {
		
		try {
		
		Connection con = connectionClass.createConnection();
		
		String q = "select * from pets ;";
		String q1="select * from pets_owner";
		
		Statement stmt = con.createStatement();
		
		ResultSet r1 = stmt.executeQuery(q);
		
		ResultSet r2 = stmt.executeQuery(q1);
		
		
		System.out.println("Pets details are :-");
		
		while(r1.next()) {
		
			System.out.println(r1.getInt(1));
			System.out.println(r1.getString(2));
			System.out.println(r1.getString(3));
			System.out.println(r1.getInt(4));
			
		}
		
		System.out.println("pets owner details :-");
		
		while(r2.next()) {
			
			System.out.println(r2.getInt(1));
			System.out.println(r2.getString(2));
			
		}
		
		}catch(Exception e) {
			
			e.getStackTrace();
			
		}
		
	}

	public static void delete(int id) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection con = connectionClass.createConnection();
			
			String sql="delete from pets  where id=?;";
			String sql1="delete from pets  where id=?;";
			
			PreparedStatement psmt=con.prepareStatement(sql);
			PreparedStatement psmt1=con.prepareStatement(sql1);
			psmt.setInt(1, id);
			psmt1.setInt(1,id);
			
			psmt.executeUpdate();
			psmt1.executeUpdate();
			
			
		}catch(Exception e) {
			
			e.getStackTrace();
			
		}
		
		
	}
	
	
	
}
