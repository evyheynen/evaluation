package be.oak3.evaluation.controller;

import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.service.EvaluationService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {

    private EvaluationService service;

    @Autowired
    public EvaluationController(EvaluationService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/instructors")
    public ResponseEntity findAllInstructors(){
        return ResponseEntity.ok(service.findAllInstructors());
    }

    @GetMapping("/courses")
    public ResponseEntity findAllCourses(){
        return ResponseEntity.ok(service.findAllCourses());
    }

    @GetMapping("/questions")
    public ResponseEntity findAllQuestions(){
        return ResponseEntity.ok(service.findAllQuestions());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addEvaluation(Evaluation evaluation) {
        return ResponseEntity.ok(service.addEvaluation(evaluation));
    }
}
