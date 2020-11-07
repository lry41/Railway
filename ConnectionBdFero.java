package ConnectionBdFero;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionBdFero {
	
	private static final  String JdbcURL = "jdbc:mysql://localhost:8889/projetFero?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final  String Username = "root";
	private static final  String password = "root";
    
	public static Connection connect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			    Connection conn=DriverManager.getConnection(JdbcURL, Username, password);
			    return conn;
			}
		catch(ClassNotFoundException | SQLException e){
			
			Logger.getLogger(ConnectionBdFero.class.getName()).log(Level.SEVERE,null,e);
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
}
