package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationJpaRepository extends JpaRepository<Evaluation, Integer> {

}
