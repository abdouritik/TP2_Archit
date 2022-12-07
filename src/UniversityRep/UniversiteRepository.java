package UniversityRep;




import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements Universite{
	
	
	public Universite GetById(int universityId) throws SQLException {
		
		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		System.out.println("LogBD : début recherche de id université dans la base de donnée");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		System.out.println("LogBD : université récupérée");
		
		connect.close();
		return u;	
	
		
	}

	@Override
	public TypePackage getPack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getI_univ() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
}
