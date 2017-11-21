package be.oak3.evaluation.service;

import be.oak3.evaluation.model.Evaluation;

//BUSINESS LOGIC
public interface EvaluationService {

    int addEvaluation(Evaluation evaluation);

    int updateEvaluation(Evaluation evaluation);

    void deleteEvaluation(Evaluation evaluation);

}
