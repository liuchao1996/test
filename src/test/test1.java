package test;

public class test1 {
	
	
public static void main(String[] args) {
	
	student s = new student();
	if(s instanceof student) {
		System.out.println("这是一个学生对象");
	}
	System.out.println(s.PI);
	s.smoking();
	Person t = new teacher();
	t.smoking();
}
	
	
	
}
