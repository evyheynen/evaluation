package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.model.Instructor;

import java.util.List;

public interface EvaluationRepository {

    int addEvaluation(Evaluation evaluation);

    List<Evaluation> findAll();
    List<Instructor> findAllInstructors();

    //    int updateEvaluation(Evaluation evaluation);
    //    int deleteEvaluation(Evaluation evaluation);
}
