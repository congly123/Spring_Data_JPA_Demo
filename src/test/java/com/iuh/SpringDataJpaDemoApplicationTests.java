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
	void findAll() {
		List<Student> students = studentRepository.findAll();
		System.out.println(students);
	}

	@Test
	void createStudent() {
		Student student = new Student();
		student.setName("Nguyen Long Nhut");
		student.setAge(21);
		studentRepository.save(student);
	}

	@Test
	void updateStudent() {
		Student student = new Student();
		student.setId(4);
		student.setName("Nguyen Long Phan Quan");
		student.setAge(21);
		studentRepository.save(student);
	}

	@Test
	void deleteStudent() {
		// Delete student có id = 4
		studentRepository.deleteById(4);
	}
}
