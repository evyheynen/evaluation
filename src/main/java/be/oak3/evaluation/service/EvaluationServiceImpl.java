package be.oak3.evaluation.service;

import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluationServiceImpl implements EvaluationService {


    private final EvaluationRepository repository;

    @Autowired
    public EvaluationServiceImpl(EvaluationRepository repository) {
        this.repository = repository;
    }

    @Override
    public int addEvaluation(Evaluation evaluation) {
        return repository.addEvaluation(evaluation);
    }

    @Override
    public int updateEvaluation(Evaluation evaluation) {
        return repository.updateEvaluation(evaluation);
    }

    @Override
    public void deleteEvaluation(Evaluation evaluation) {

    }

}
