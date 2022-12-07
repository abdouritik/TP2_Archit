import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewInscription {
	  // Les zones de Textes
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtMatricule = new JTextField(10);
    JTextField txtNom = new JTextField(10);
    JTextField txtPrenom = new JTextField(10);
    JTextField txtEmail = new JTextField(10);
    JTextField txtPwd = new JTextField(10);
    JTextField txtIdentificationUniv = new JTextField(10);
	
    // Création des labels 
    JLabel lblMatricule = new JLabel("Matricule :", JLabel.RIGHT); 
    lblMatricule.setLabelFor(txtMatricule); 
    JLabel lblNom = new JLabel("Nom :", JLabel.RIGHT);
    lblNom.setLabelFor(txtNom); 
    JLabel lblPrenom = new JLabel("Prenom :", JLabel.RIGHT);
    lblPrenom.setLabelFor(txtPrenom); 
    JLabel lblEmail = new JLabel("Email :", JLabel.RIGHT);
    lblEmail.setLabelFor(txtEmail); 
    JLabel lblPwd = new JLabel("mot de passe :", JLabel.RIGHT);
    lblPwd.setLabelFor(txtPwd); 
   JLabel lblidentificationUniv = new JLabel("identification Universite : ", JLabel.RIGHT);
   lblidentificationUniv.setLabelFor(txtidentificationUniv); 
   
   //Creation des deux bouttons Submit et cancel
   
   JButton bot1 = new JButton ("Cancel");
   JButton bot2 = new JButton ("Submit");
   
   
   
   
   //Creation de pannel
   JPanel p = new JPanel( );
   p.setLayout(new GridLayout(5, 4, 7, 7));
   p.add(lblMatricule);
   p.add(txtMatricule);
   p.add(lblNom);
   p.add(txtNom);
   p.add(lblPrenom);
   p.add(txtPrenom);
   p.add(lblEmail);
   p.add(txtEmail);
   p.add(lblPwd);
   p.add(txtPwd);
   p.add(lblidentificationUniv);
   p.add(txtidentificationUniv);
   p.add(bot1);
   p.add(bot2);
   
   //Creation de fenetre d'application
   JFrame f = new JFrame("ViewInscription");
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f.setContentPane(p);
   f.pack( );
   f.setVisible(true);
   
}


}
