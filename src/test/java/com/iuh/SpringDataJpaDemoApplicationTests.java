package com.iuh;

import com.iuh.entity.Student;
import com.iuh.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaDemoApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void getStudents() {
		List<Student> students = studentRepository.getStudentByAge();
		System.out.println(students);
	}

	@Test
	void deleteStudent() {
		studentRepository.deleteStudentbyId(2);
	}
}
