package UniversityRep;


import java.sql.SQLException;



public interface Universite {


	Universite GetById(int universityId) throws SQLException;

	TypePackage getPack();

	int getI_univ();

 
 
}


