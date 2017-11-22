package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseJpaRepository extends JpaRepository<Courses,Integer> {

    @Query("select id, name from courses")
    List<Courses> findAllCourses();
}
