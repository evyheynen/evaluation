package be.oak3.evaluation.repository;

import be.oak3.evaluation.model.*;
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
    private final StudentJpaRepository repositoryStudent;

    @Autowired
    public EvaluationRepositoryImpl(EvaluationJpaRepository repository, InstructorJpaRepository repositoryInstructors,
                                    CourseJpaRepository repositoryCourses, QuestionJpaRepository repositoryQuestions,
                                    StudentJpaRepository repositoryStudent) {
        this.repository = repository;
        this.repositoryInstructors = repositoryInstructors;
        this.repositoryCourses = repositoryCourses;
        this.repositoryQuestions = repositoryQuestions;
        this.repositoryStudent = repositoryStudent;
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

    @Override
    public List<Student> findAllStudents() {
        return repositoryStudent.findAllStudents();
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
