package student;

public class Student implements Comparable<Student> {

	private String name;
	
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student s) {
		int num = this.age - s.getAge();
		if(num == 0) {
			num = this.name.compareTo(s.getName());
		}
		return num;
	}

	
}
