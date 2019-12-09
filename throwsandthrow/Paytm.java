package throwsandthrow;

public class Paytm {
	IRCTC i1;

	public Paytm(IRCTC i1) {
		super();
		this.i1 = i1;
	}
	void Booktickets() {
		try {
			i1.confirmTicket();
		} catch(ClassNotFoundException e)
		{
			System.out.println("confirm ticket is not confirmed");
		}
	
		
	}

}
