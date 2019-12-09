package Exception1;

public class Testb {
	public static void main(String[] args) {
		System.out.println("main started");
		ExceptionA e1=new ExceptionA();
		e1.exception(0, "ramu");
		e1.exception(2, null);
		System.out.println("main ended");

}
}
