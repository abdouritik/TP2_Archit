package EtudiantRep;




import java.sql.SQLException;
import java.util.ArrayList;
public class EtudiantService implements Etudiant{
	

	private int matricule;
    private String nom;
    private String prenom;
    protected String email ;
    private String pwd;
    private int nbLivreMensuel_Autorise;
    private int nbLivreEmprunte;
    private int id_universite;
    private Etudiant E;
    
 
	
	/*public EtudiantService(Etudiant E) {
		E.matricule = matricule;
		E.nom = nom;
		E.prenom = prenom;
		E.email = email;
		E.pwd = pwd;
		E.id_universite = id_universite;
		E.id_universite = id_universite;
		E.nbLivreMensuel_Autorise=nbLivreMensuel_Autorise;
		E.nbLivreEmprunte = nbLivreEmprunte;
	}*/

	

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}



@Override
public void add(EtudiantRepository E) throws SQLException {
	// TODO Auto-generated method stub
	
}



@Override
public boolean Exists(String email) throws SQLException {
	// TODO Auto-generated method stub
	return false;
}



@Override
public boolean Exists(int mat) throws SQLException {
	// TODO Auto-generated method stub
	return false;
}



@Override
public boolean inscription(int matricule, String nom, String prenom,
		String email, String pwd, int nbLivreMensuel_Autorise,
		int nbLivreEmprunte, int id_universite) throws SQLException {
	// TODO Auto-generated method stub
	return false;
}



@Override
public void Bonus_livre() {
	// TODO Auto-generated method stub
	
}



@Override
public void Bonus_livre(int n) {
	// TODO Auto-generated method stub
	
}


/*L'ancien code avant Appliquer le principe d'inversion de controle
 * boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
{
	EtudiantRepository StudRep= new EtudiantRepository();
    UniversiteRepository UnivRep= new UniversiteRepository();
    Etudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
    Universite univ=UnivRep.GetById(id_universite);
    
    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
    
    if(email == null || email.length() == 0)
    {
    	return false;
    }
    
    if (StudRep.Exists(matricule))
    {
        return false;
    }
    
	if (StudRep.Exists(email))
    {
        return false;
    }
	
	
	
	 if (univ.getPack() == TypePackage.Standard)
     {
          stud.setNbLivreMensuel_Autorise(10);
     }
     else if (univ.getPack() == TypePackage.Premium)
     {
    	 stud.setNbLivreMensuel_Autorise(10*2);
     }                           
     
	 StudRep.add(stud);
	 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	 return true;
    
	
}
*/

	
}
