package be.oak3.evaluation.service;

import be.oak3.evaluation.model.Courses;
import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.model.Instructor;
import be.oak3.evaluation.model.Question;

import java.util.List;

//BUSINESS LOGIC
public interface EvaluationService {

    List<Evaluation> findAll();
    List<Instructor> findAllInstructors();
    List<Courses> findAllCourses();
    List<Question> findAllQuestions();

    int addEvaluation(Evaluation evaluation);


//    int updateEvaluation(Evaluation evaluation);
//    void deleteEvaluation(Evaluation evaluation);
}
