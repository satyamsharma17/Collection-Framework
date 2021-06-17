package comparatorsAndComparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

	List<Student> students = new ArrayList<>();

	students.add(new Student(23, "Raju"));
	students.add(new Student(29, "Raju"));
	students.add(new Student(63, "Baburao"));
	students.add(new Student(93, "Totla Seth"));
	students.add(new Student(93, "Devi Prasad"));
	
	Collections.sort(students, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.name.equals(o2.name)) {
				return o1.marks - o2.marks;
			} else {
				return o1.name.compareTo(o2.name);
			}
		}
		
	});
	
//	Sorting with Lambda
	
	Collections.sort(students, (o1, o2) -> {
			if(o1.name.equals(o2.name)) {
				return o1.marks - o2.marks;
			} else {
				return o1.name.compareTo(o2.name);
			}
		});
	
	Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
	
		Collections.sort(students, Comparator.comparing(Student::getName)
				.thenComparing(Student::getMarks).reversed());
	
		students.forEach(System.out::println);
	}

}

//class SortByNameThenMarks implements Comparator<Student> {
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.name.equals(o2.name) ) {
//			return o1.marks - o2.marks;
//		} else {
//			return o1.name.compareTo(o2.name);
//		}
//	}
//}
