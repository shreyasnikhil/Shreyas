import java.sql.*;
public class ConnectionProvider {
	public static Connection getCon() throws SQLException{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
			return con;
		
	}
}
