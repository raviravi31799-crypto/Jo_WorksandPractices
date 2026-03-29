package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertjdbc {
    public static void insert(int id, String name, String course, String email) {


		String dbUrl="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Jothika@05";
		try(Connection con=DriverManager.getConnection(dbUrl,username,password)){
	String sql1="insert into Student(Id,Name,Course,Email) VALUES(?,?,?,?)";
	PreparedStatement statement =con.prepareStatement(sql1);
	statement.setInt(1, id);
	statement.setString(2, name);
	statement.setString(3, course);
	statement.setString(4, email);
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




