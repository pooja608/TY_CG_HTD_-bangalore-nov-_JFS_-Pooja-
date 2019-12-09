package set;

import java.util.HashSet;

public class Custom {
	public static void main(String[] args) {
		HashSet<Student> s1=new HashSet<Student>();
		s1.add(new Student(22,"divya"));
		s1.add(new Student(22,"shree"));
		s1.add(new Student(22,"ramesh"));
		s1.add(new Student(22,"divya"));
		for(Student s2:s1)
		{
			System.out.println(s2.Studage + s2.Studname);
		}
	}

}
