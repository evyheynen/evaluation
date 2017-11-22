package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.Courses;
import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.model.Instructor;
import be.oak3.evaluation.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;


@Repository
public class EvaluationRepositoryImpl implements EvaluationRepository {

    private final EvaluationJpaRepository repository;
    private final InstructorJpaRepository repositoryInstructors;
    private final CourseJpaRepository repositoryCourses;
    private final QuestionJpaRepository repositoryQuestions;

    @Autowired
    public EvaluationRepositoryImpl(EvaluationJpaRepository repository, InstructorJpaRepository repositoryInstructors, CourseJpaRepository repositoryCourses, QuestionJpaRepository repositoryQuestions) {
        this.repository = repository;
        this.repositoryInstructors = repositoryInstructors;
        this.repositoryCourses = repositoryCourses;
        this.repositoryQuestions = repositoryQuestions;
    }

    @Override
    public int addEvaluation(Evaluation evaluation) {
        Evaluation e = repository.saveAndFlush(evaluation);
        return e != null ? 1 : 0;
    }

    @Override
    public List<Evaluation> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Instructor> findAllInstructors() {
        return repositoryInstructors.findAllInstructors();
    }

    @Override
    public List<Courses> findAllCourses(){
        return repositoryCourses.findAllCourses();
    }

    @Override
    public List<Question> findAllQuestions(){
        return repositoryQuestions.findAllQuestions();
    }


//    @Override
//    public int updateEvaluation(Evaluation evaluation) {
//        return 0;
//    }
//
//    @Override
//    public int deleteEvaluation(Evaluation evaluation) {
//        return 0;
//    }
}
