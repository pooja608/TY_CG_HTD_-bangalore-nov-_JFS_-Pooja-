package set;

import java.util.HashSet;

public class Hashset1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(33);
		hs.add(53);
		hs.add(63);
		hs.add(null);
		for(Object object:hs) {
			System.out.println(hs.hashCode());
			System.out.println(object);
		}
		
	}

}
