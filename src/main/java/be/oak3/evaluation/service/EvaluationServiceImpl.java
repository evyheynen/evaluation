package be.oak3.evaluation.service;

import be.oak3.evaluation.model.Evaluation;

public class EvaluationServiceImpl implements EvaluationService {

    @Override
    public int addEvaluation(Evaluation evaluation) {
        return repository.addEvaluation(evaluation);
    }

    @Override
    public int updateEvaluation(Evaluation evaluation) {
        return repository.updateEvalation(evaluation);
    }

    @Override
    public void deleteEvaluation(Evaluation evaluation) {
    }

}
