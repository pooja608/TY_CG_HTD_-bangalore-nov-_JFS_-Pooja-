package treeset;

import java.util.Comparator;

public class Employeename implements Comparator<Employee>{

	@Override
	public int compare(Employee o2, Employee o1) {
		return o1.name.compareTo(o2.name);
	}

}
