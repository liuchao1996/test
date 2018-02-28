package student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {

		TreeSet<Student> students = new TreeSet<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要添加的人数：");
		int count = sc.nextInt();
		for(int i=0 ; i < count; i++) {
			sc = new Scanner(System.in);
			System.out.println("请输入姓名");
			String name = sc.nextLine();
			System.out.println("请输入年龄");
			int age = sc.nextInt();
			Student st= new Student();
			st.setName(name);
			st.setAge(age);
			students.add(st);
		}
		
	    BufferedWriter writer= null;
		try {
			writer = new BufferedWriter( new FileWriter("student.txt"));
           for (Student student : students) {
			      
        	   writer.write(student.getName()+"--"+student.getAge());
        	   writer.newLine();
		}
           writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
				
		
		
	}

}
