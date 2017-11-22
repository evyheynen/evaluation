package be.oak3.evaluation.service;

import be.oak3.evaluation.model.Courses;
import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.model.Instructor;
import be.oak3.evaluation.model.Question;
import be.oak3.evaluation.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationServiceImpl implements EvaluationService {

    private final EvaluationRepository repository;

    @Autowired
    public EvaluationServiceImpl(EvaluationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Evaluation> findAll(){
        return repository.findAll();
    }

    @Override
    public List<Instructor> findAllInstructors() {
        return repository.findAllInstructors();
    }

    @Override
    public List<Courses> findAllCourses(){
        return repository.findAllCourses();
    }

    @Override
    public List<Question> findAllQuestions() {
        return repository.findAllQuestions();
    }


    @Override
    public int addEvaluation(Evaluation evaluation) {
        return repository.addEvaluation(evaluation);
    }




//    @Override
//    public int updateEvaluation(Evaluation evaluation) {
//        return repository.updateEvaluation(evaluation);
//    }
//
//    @Override
//    public void deleteEvaluation(Evaluation evaluation) {
//
//    }

}
