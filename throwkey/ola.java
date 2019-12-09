package throwkey;

public class ola {
	GoogleMap g1;

	public ola(GoogleMap g1) {
		super();
		this.g1 = g1;
	}
	void find(String a)
	{
		try {
			g1.findlocation(a);
		}
		catch(NullPointerException e)
		{
			System.out.println("ola user please fill the location name");
		}
	}

}
