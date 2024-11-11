package com.spring.jdbc;


import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main
{

	public static void main(String[] args) {
		System.out.println("hello worlf");
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(javaconfig.class);
		StudentDao studentDao=(StudentDao)applicationContext.getBean("studentDao");

//		Student student=new Student();
//		student.setId(5);
//		student.setName("anupam");
//		student.setCity("Deoria");
//		System.out.println(studentDao.insert(student));
        Student s=new Student();
		s.setId(5);
		s.setCity("Lucknow");
		s.setName("Sharma");
		System.out.println(studentDao.change(s));
		System.out.println(studentDao.delete(5));
		Student student=studentDao.getStudent(222);
		System.out.println(student);
		List<Student> list=studentDao.getAllStudents();
		System.out.println(list);

	}

}
