package Exceptionpropogation;

public class A {
	static void o() {
		try {
			B.n();
		}
		catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		throw e;
		}
	}
}


