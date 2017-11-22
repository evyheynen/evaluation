package be.oak3.evaluation.service;

import be.oak3.evaluation.model.*;

import java.util.List;

//BUSINESS LOGIC
public interface EvaluationService {

    List<Evaluation> findAll();
    List<Instructor> findAllInstructors();
    List<Courses> findAllCourses();
    List<Question> findAllQuestions();
    List<Student> findAllStudents();

    int addEvaluation(Evaluation evaluation);


//    int updateEvaluation(Evaluation evaluation);
//    void deleteEvaluation(Evaluation evaluation);
}
