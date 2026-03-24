package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {

	public static void main(String[] args) {
		String dbUrl="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Jothika@05";
		try(Connection con=DriverManager.getConnection(dbUrl,username,password)){
	String sql1="UPDATE Student Set course=?,Email=? where Name=?";
	PreparedStatement statement =con.prepareStatement(sql1);
	
	
	statement.setString(1, "Biology");
	statement.setString(2, "bibin28@gmail.com");
	statement.setString(3, "Bibin");
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






	


