package DBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	String BDD = "tp2_archi";
	String url = "jdbc:mysql://localhost:3306/" + BDD;
	String user = "root";
	String passwd = "";
    private Connection conn;

  

    public DBConnection() throws SQLException {
		conn=DriverManager.getConnection(url, user,passwd);
	}
    
    

    
    public Connection getConn() {
		return conn;
	}
}