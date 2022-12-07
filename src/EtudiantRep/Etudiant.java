package EtudiantRep;


import java.sql.SQLException;
import java.util.ArrayList;



public interface Etudiant {

	//ajouter un etudiant comme la classe Etudiant repository
		public void add(EtudiantRepository E) throws SQLException;
		
		//est-ce-que l'email existe déjà ou non
		public  boolean Exists(String email) throws SQLException;
		
		//est-ce-que la matricule existe déjà
		
		public 	boolean Exists(int mat) throws SQLException;
		
		//Les méthodes pour la class EtudiantService
		
		//Methode d'inscription pour le nouveau etudiant
		public boolean inscription (int matricule, String nom, String prenom, String email, String pwd, 
				int nbLivreMensuel_Autorise, int nbLivreEmprunte, int id_universite) throws SQLException;
		
		//Introduire les étudiants à une nouvelle liste 
		
		public ArrayList<Etudiant> GetEtudiantParUniversitye();
		
		//Introduire la liste des emprunts
		public ArrayList<Etudiant> GetEtudiatparLivreEmprunte();
		
		//Ajouter un bonus au forfait de bonus nombre de livres emprunter
		public void Bonus_livre();

		void Bonus_livre(int n);

			
		    }
	

/*private int matricule;
private String nom;
private String prenom;
private String email ;
private String pwd;
private int nbLivreMensuel_Autorise;
private int nbLivreEmprunte;
private int id_universite;


public Etudiant(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
	
	this.matricule = matricule;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.pwd = pwd;
	this.id_universite = id_universite;
}


public int getMatricule() {
	return matricule;
}


public void setMatricule(int matricule) {
	this.matricule = matricule;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public int getNbLivreMensuel_Autorise() {
	return nbLivreMensuel_Autorise;
}


public void setNbLivreMensuel_Autorise(int nbLivreMensuel_Autorise) {
	this.nbLivreMensuel_Autorise = nbLivreMensuel_Autorise;
}


public int getNbLivreEmprunte() {
	return nbLivreEmprunte;
}


public void setNbLivreEmprunte(int nbLivreEmprunte) {
	this.nbLivreEmprunte = nbLivreEmprunte;
}


public int getId_universite() {
	return id_universite;
}


public void setId_universite(int id_universite) {
	this.id_universite = id_universite;
}


public String getPwd() {
	return pwd;
}


public void setPwd(String pwd) {
	this.pwd = pwd;
}



}*/

