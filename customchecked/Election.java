package customchecked;

public class Election throws AgeLimitException {
	void vote(int age) {
		if(age>18)
		{
			throw new Age();
		} else 
		{
			System.out.println("allowed for voting");
		}
		
	}

}
