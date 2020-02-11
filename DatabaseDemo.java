import java.sql.*;
public class DatabaseDemo
{
	public static void main(String args[]) throws Exception {
		
		
		String sql1="create table employee(emp_id smallint not null primary key,emp_name varchar(30));";
		
	//	String sql2 = "insert into employee values (1,'Harshal');";
	//	String sql3 = "insert into employee values (2,'Hari'),(3,'Kartik');";
		String sq14 = "insert into employee (emp_id,emp_name) values(?,?)" ;
		String sql = "select * from employee";
		String sq5 = "delete from employee where emp_id=?";
		
	
		
		
		//step2
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step3
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","admin");
		
		//step4
		Statement st =con.createStatement();
		
		//st.executeUpdate(sql1);
		//st.executeUpdate(sql3);
		ResultSet rs = st.executeQuery(sql);
		while (rs.next())
		{
			
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		
			
		}
		
	/*	PreparedStatement pstmt = con.prepareStatement(sq5);
		pstmt.setInt(1,4);
		//pstmt.setString(2,"Sayan");
		pstmt.executeUpdate();
		psmt.close();*/
		
		
		System.out.println("-------Query Executed Successfully-------");
		
		
		
		
		
		st.close();
		con.close();
		
		
	}
	
}
