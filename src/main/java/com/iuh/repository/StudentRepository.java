package com.iuh.repository;

import com.iuh.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Tìm student có tuổi >= 20
    @Query(value = "SELECT * FROM Student WHERE age >= 20", nativeQuery = true)
    List<Student> getStudentByAge();

    // Delete student có id = ?
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Student WHERE id = ?1", nativeQuery = true)
    void deleteStudentbyId(int id);
}
