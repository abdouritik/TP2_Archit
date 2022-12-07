package DBC;


public class DBConnectionSegleton {

	private static DBConnectionSegleton instance = new DBConnectionSegleton();
	
	private DBConnectionSegleton() {
		
	}
	
	public static DBConnectionSegleton getInstance() {
		return instance;
	}
	
}
