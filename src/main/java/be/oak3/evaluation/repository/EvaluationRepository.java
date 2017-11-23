package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.*;

import java.util.List;

public interface EvaluationRepository {

    int addEvaluation(Evaluation evaluation);
    int addStudent(Student student);
    int addAnswer (Answer answer);

    List<Evaluation> findAll();
    List<Instructor> findAllInstructors();
    List<Courses> findAllCourses();
    List<Question> findAllQuestions();
    List<Student> findAllStudents();

    //    int updateEvaluation(Evaluation evaluation);
    //    int deleteEvaluation(Evaluation evaluation);
}
