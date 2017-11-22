package be.oak3.evaluation.repository;


import be.oak3.evaluation.model.Courses;
import be.oak3.evaluation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentJpaRepository extends JpaRepository<Student,Integer> {

        @Query("select '*'from student")
        List<Student> findAllStudents();
    }

