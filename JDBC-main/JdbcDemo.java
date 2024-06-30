package jdbc;

//1.import the package-->phone-->sql package-->completed
//2.load or Register the driver-->sim Card-->"com.mysql.cj.jdbc.Driver"----forName();
//3.Establish the connection-->call the particular person-->static method-->get connection(parameter)
//4.Create the Statement-->prepare the question-->create statement();//three type - statement, prepared statement
//5.Execute the query-->Ask the question-->execute query();
//6.process the result-->Speak back
//7.close the connection-->hang up the call//close()

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/databl";
		String Username = "root";
		String Password = "12345";
		/*String query = "select empName from employee where empId = 2";*/
		String query = "select ' from employee";
		

		Class.forName("com.mysql.cj.jdbc.Driver");//completed
		Connection con = DriverManager.getConnection(url,Username,Password);
		Statement st = con.createStatement();//completed
		
		ResultSet rs = st.executeQuery(query);//completed
		
		while(rs.next()) {
			
			String table = "";
			
			table = rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4);
			System.out.println(table);
			rs.next();
		}
		
		/*rs.next();
		String table="";
		table = rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4);
		System.out.println(table);
		rs.next();
		
		table = rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4);
		System.out.println(table);
		rs.next();
		
		table = rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4);
		System.out.println(table);
		rs.next();
		
		table = rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4);
		System.out.println(table);
		rs.next();*/
		
		
		/*String name = rs.getString("empName");//Completed
		System.out.println(name);*/
		
		st.close();
		con.close(); //completed
		
	}

}
