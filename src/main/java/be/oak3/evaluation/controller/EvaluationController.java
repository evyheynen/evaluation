package be.oak3.evaluation.controller;

import be.oak3.evaluation.model.Answer;
import be.oak3.evaluation.model.Evaluation;

import be.oak3.evaluation.model.Student;
import be.oak3.evaluation.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/students")
    public ResponseEntity findAllStudents(){
        return ResponseEntity.ok(service.findAllStudents());
    }

    @GetMapping("/answers")
    public ResponseEntity findAllAnswers(){
        return ResponseEntity.ok(service.findAllAnswers());
    }

    @PostMapping
    public ResponseEntity addEvaluation(@RequestBody Evaluation evaluation) {
        return ResponseEntity.ok(service.addEvaluation(evaluation));
    }

    @PostMapping("/students")
    public ResponseEntity addStudent(@RequestBody Student student){
        return ResponseEntity.ok(service.addStudent(student));
    }

    @PostMapping("/answers")
    public ResponseEntity addAnswer(@RequestBody Answer answer){
        return ResponseEntity.ok(service.addAnswer(answer));
    }
}
