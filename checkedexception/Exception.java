package checkedexception;

public class Exception {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			Class c1=Class.forName("checkedException.person");
			System.out.println("class is found");
		} catch (ClassNotFoundException e) {
			
			System.out.println("class i not found");
		}
		System.out.println("main ended");
		
	}

}
