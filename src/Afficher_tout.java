

public class Afficher_tout implements IJournal{

protected String message ="TP2 Est afficher ";
	
	protected IJournal msg = new AfficheMessageDirectement();
	protected IJournal msg2 = new AfficherMessageDate();
	protected IJournal msg3 = new AfficherMessageFechier();
	
	
	@Override
	public void outPut_Msg(String Message) {
		// TODO Auto-generated method stub
		
	}

}
