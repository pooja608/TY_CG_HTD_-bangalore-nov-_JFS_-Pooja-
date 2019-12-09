package set;

public class Employee {
	int Empage;
	String Empname;
	public Employee(int empage, String empname) {
		super();
		this.Empage = empage;
		this.Empname = empname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Empage;
		result = prime * result + ((Empname == null) ? 0 : Empname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Empage != other.Empage)
			return false;
		if (Empname == null) {
			if (other.Empname != null)
				return false;
		} else if (!Empname.equals(other.Empname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [Empage=" + Empage + ", Empname=" + Empname + "]";
	}
	
	
	

}
