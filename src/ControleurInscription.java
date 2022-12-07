import javax.swing.JTextField;



public class ControleurInscription extends ViewInscription{


	//j'ai recuperer les valeurs (Modele)
		String Matricule = JTextField.getText(txtMatricule);
		String Nom = JTextField.getText(txtNom);
		String Prenom = JTextField.getText(txtPrenom);
		String email = JTextField.getText(txtEmail);
		String pwd = JTextField.getText(txtPwd);
		String id = JTextField.getText(txtIdentificationUniv);


		//Affichage des valeurs pour vue
				
		System.out.println("Votre matricule est :" + Matricule + "\n");
		System.out.println("Votre nom est :" + Nom + "\n");
		System.out.println("Votre Prenom est :" + Prenom + "\n");
		System.out.println("Votre email est :" + email + "\n");
		System.out.println("Votre id_universite est :" + id + "\n");
		
		
		
		//Traiter les données par appel de fonctions verfier email et matricule (Controleur)
		
		Etudiant E = new EtudiantService();
		boolean Eemail ;
		boolean Ematricule;
		Eemail = E.Exists(email);
		Ematricule = E.Exists(Matricule);
		if(Eemail == true) {
			if(Ematricule == true) {
				Object statement;
				//inserer les variables dans la base de donnees
				int statut = statement.executeUpdate( "INSERT INTO inscription (Matricule, nom, Prenom, email,"
						+ "password,id_uni) VALUES ('Matricule','Nom','Prenom','email',"
						+ " MD5('pwd'), 'id'");
			}else {
				System.out.println("La matricule déjà existe. Verifier votre matricule");
			}
			
		}else {
			System.out.println("L'email existe déjà. Vérifier votre email");
		
		}
}}

