
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AfficherMessageDate implements IJournal{
	@Override
	public void outPut_Msg(String Message) {
		 Date actuelle = new Date(0);
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 String dat = dateFormat.format(actuelle);
		 System.out.println(Message);
		 System.out.println(dat);
		
	}

}
