package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionJpaRepository extends JpaRepository<Question,Integer> {

    @Query("select id, question from questions")
    List<Question> findAllQuestions();
}
