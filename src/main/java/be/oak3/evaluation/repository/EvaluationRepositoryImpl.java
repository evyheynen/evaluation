package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.model.Instructor;
import be.oak3.evaluation.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    @Query
    public List<Instructor> findByInstructor(Instructor instructor) {
        return repository.findByInstructor(instructor);
    }

    public List<Question> findByQuestion(Question question) {return repository.findByQuestion(question);}


}
