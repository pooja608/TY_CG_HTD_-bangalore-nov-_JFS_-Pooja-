package set;

import java.util.HashSet;

public class Hashset3 {
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(new Person(22,"divya"));
		h1.add(new Person(22,"shree"));
		h1.add(new Person(22,"divya"));
		for(Object obj:h1)
		{
			System.out.println();
		}
		
	}

}
