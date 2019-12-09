package customexception;

public class DayLimitException1 extends RuntimeException {
	String msg;
	

	
	public DayLimitException1(String msg) {
		super();
		this.msg = msg;
	}
	
	
	String GetMessage() {
		return this.msg;
	}

}
