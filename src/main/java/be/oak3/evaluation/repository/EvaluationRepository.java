package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Courses;
import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.model.Instructor;
import be.oak3.evaluation.model.Question;

import java.util.List;

public interface EvaluationRepository {

    int addEvaluation(Evaluation evaluation);

    List<Evaluation> findAll();
    List<Instructor> findAllInstructors();
    List<Courses> findAllCourses();
    List<Question> findAllQuestions();

    //    int updateEvaluation(Evaluation evaluation);
    //    int deleteEvaluation(Evaluation evaluation);
}
