package treeset;

import java.util.Comparator;

public class Employeesal implements Comparator<Employee>{

	@Override
	public int compare(Employee o2, Employee o1) {
		if(o1.salary>o2.salary) {
			return 1;
		}else if(o1.salary<o2.salary)
		{
			return -1;
		}else
		{
			return 0;
		}
	}

}
