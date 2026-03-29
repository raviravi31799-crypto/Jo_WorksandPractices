package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletejdbc {

    public static void delete(String name) {
		String dbUrl="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Jothika@05";
		try(Connection con=DriverManager.getConnection(dbUrl,username,password)){
	String sql1="Delete from Student where Name=?";
	PreparedStatement statement =con.prepareStatement(sql1);
	statement.setString(1, name);
	int rowsDeleted=statement.executeUpdate();
	if(rowsDeleted>0) {
		System.out.println("Student details deleted successfully!!");
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
