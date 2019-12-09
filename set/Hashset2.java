package set;

import java.util.HashSet;

public class Hashset2 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("shree");
		hs.add("divya");
		hs.add("anu");
		hs.add(null);
		
		for(Object obj:hs)
		{
			System.out.println(obj);
			
		}
	}

}
