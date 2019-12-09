package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash1 {
	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(26);
		l1.add(56);
		l1.add(null);
		
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
