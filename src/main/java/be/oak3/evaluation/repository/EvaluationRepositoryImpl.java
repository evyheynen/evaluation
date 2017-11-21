package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EvaluationRepositoryImpl implements EvaluationRepository {

    private final EvaluationJpaRepository repository;

    @Autowired
    public EvaluationRepositoryImpl(EvaluationJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public int addEvaluation(Evaluation evaluation) {
        Evaluation e = repository.saveAndFlush(evaluation);
        return e != null ? 1 : 0;
    }

    @Override
    public int updateEvaluation(Evaluation evaluation) {
        return 0;
    }

    @Override
    public int deleteEvaluation(Evaluation evaluation) {
        return 0;
    }
}
