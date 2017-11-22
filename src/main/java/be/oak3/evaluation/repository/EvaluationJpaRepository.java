package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EvaluationJpaRepository extends JpaRepository<Evaluation, Integer> {

}
