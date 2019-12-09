package treeset;

import java.util.TreeSet;

public class Treeset2 {
	public static void main(String[] args) {
		TreeSet<Student> t1=new TreeSet<Student>();
		t1.add(new Student(56,"paramesh"));
		t1.add(new Student(23,"divya"));
		t1.add(new Student(26,"chait"));
		
		for (Student s1 : t1) {
			System.out.println(s1);
			
		}
	}

}
