package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
	public static void main(String[]args) {
		String dbUrl="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Jothika@05";
		try(Connection con=DriverManager.getConnection(dbUrl,username,password)){
	String sql1="insert into Student(Id,Name,Course,Email) VALUES(?,?,?,?)";
	PreparedStatement statement =con.prepareStatement(sql1);
	statement.setInt(1, 101);
	statement.setString(2, "Bibin");
	statement.setString(3, "Maths");
	statement.setString(4, "bibin@gmail.com");
	int rowsInserted=statement.executeUpdate();
	if(rowsInserted>0) {
		System.out.println("A new user is inserted successfully!!");
	}

}
	catch (SQLException ex) {
	ex.printStackTrace();
}
}
}




