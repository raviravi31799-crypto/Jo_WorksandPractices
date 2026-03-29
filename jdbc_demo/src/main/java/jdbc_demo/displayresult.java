package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class displayresult {
	public static void display() {
        	 String dbUrl="jdbc:mysql://localhost:3306/testdb";
     		String username="root";
     		String password="Jothika@05";
     		try(Connection con=DriverManager.getConnection(dbUrl,username,password)){
     	String sql1="SELECT * FROM Student";
     	PreparedStatement statement =con.prepareStatement(sql1);
     	ResultSet rs=statement.executeQuery();
     	int count=0;
     	while(rs.next()) {
     		int id=rs.getInt("ID");
     		String name=rs.getString("Name");
     		String course=rs.getString("Course");
     		String email=rs.getString("Email");
     		String output ="Student#%d: %d - %s - %s - %s";
     		System.out.println(String.format(output, ++count,id,name,course,email));
     	}
     	
         }
     		catch(SQLException ex) {
     			ex.printStackTrace();
     		}
}
}
