package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc_connection {

	public static void main(String[] args) {
		String dbUrl="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Jothika@05";
		try(Connection con=DriverManager.getConnection(dbUrl,username,password)){
			String sql="CREATE TABLE Student" +"(ID INT NOT NULL," +"Name Varchar(255),"+"Course varchar(255),"+
		"Email varchar(255),"+"PRIMARY KEY(ID))";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Table created successfully!!");
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}