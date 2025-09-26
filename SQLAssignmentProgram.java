package mysqlprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLAssignmentProgram {

	public static void main(String[] args) throws SQLException {
		
		// create a connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/guvi","root","Test$123");
				
				//2. create statement/query
				java.sql.Statement stmt=con.createStatement();
				
				 stmt.execute("INSERT INTO empdata VALUES(101,'Jenny',25,10000)");
				    stmt.execute("INSERT INTO empdata VALUES(102,'Jacky',30,20000)");
				    stmt.execute("INSERT INTO empdata VALUES(103,'Joe',20,40000)");
				    stmt.execute("INSERT INTO empdata VALUES(104,'John',40,80000)");
				    stmt.execute("INSERT INTO empdata VALUES(105,'Shameer',25,90000)");
				    
				
				
				
				
				//3.close the connection
				con.close();
				System.out.println("Query Executed");
				

			

	}

}
