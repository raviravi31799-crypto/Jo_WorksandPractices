package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updatejdbc {

	public static void update(String name, String course, String email) {
		String dbUrl="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Jothika@05";
		try(Connection con=DriverManager.getConnection(dbUrl,username,password)){
	String sql1="UPDATE Student Set course=?,Email=? where Name=?";
	PreparedStatement statement =con.prepareStatement(sql1);
	
	
	statement.setString(1, course);
	statement.setString(2,email);
	statement.setString(3, name);
	int rowsUpdated=statement.executeUpdate();
	if(rowsUpdated>0) {
		System.out.println("Student details updated successfully!!");
	}
	else {
		System.out.println("No matching student found!");
		

}
		}
	catch (SQLException ex) {
	ex.printStackTrace();
}
}

}






	


