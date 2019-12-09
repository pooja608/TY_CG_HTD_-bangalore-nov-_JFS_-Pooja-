package treeset;

import java.util.TreeSet;

public class Treeset1 {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(20);
		t1.add(67);
		t1.add(27);
		t1.add(20);
		t1.add(null);
		t1.remove(20);
		for (Object object : t1) {
			System.out.println(object);
			
		}
	}

}
