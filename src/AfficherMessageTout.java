

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AfficherMessageTout implements IJournal{

	@Override
	public void outPut_Msg(String Message) {
	//Afficher message directement
		System.out.println(Message);
		
		//Afficher message avec date 
		 Date actuelle = new Date(0);
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 String dat = dateFormat.format(actuelle);
		 System.out.println(Message);
		 System.out.println(dat);
		 
		 //Afficher message dans un fichier
		 try {


			   File file = new File("test.txt");

			   // créer le fichier s'il n'existe pas
			   if (!file.exists()) {
			    file.createNewFile();
			   }

			   FileWriter fw = new FileWriter(file.getAbsoluteFile());
			   BufferedWriter bw = new BufferedWriter(fw);
			   bw.write(Message);
			   bw.close();

			   System.out.println("Modification terminée!");

			  } catch (IOException e) {
			   e.printStackTrace();
			  }
		
	}
	

}
