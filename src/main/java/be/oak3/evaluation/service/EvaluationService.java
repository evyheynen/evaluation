package be.oak3.evaluation.service;

import be.oak3.evaluation.model.Evaluation;

import java.util.List;

//BUSINESS LOGIC
public interface EvaluationService {

    List<Evaluation> findAll();

    int addEvaluation(Evaluation evaluation);

    int updateEvaluation(Evaluation evaluation);

    void deleteEvaluation(Evaluation evaluation);
}
