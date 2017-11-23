package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerJpaRepository extends JpaRepository<Answer, Integer> {

}
