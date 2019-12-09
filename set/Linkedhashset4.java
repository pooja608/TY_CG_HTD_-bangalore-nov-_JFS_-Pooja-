package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset4 {
	public static void main(String[] args) {
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee(22,"goo"));
		l1.add(new Employee(23,"gunda"));
		l1.add(new Employee(23,"gunda"));
		Iterator<Employee> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
