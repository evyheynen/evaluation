package be.oak3.evaluation.controller;

import be.oak3.evaluation.model.Evaluation;
import be.oak3.evaluation.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {

    private EvaluationService service;

    @Autowired
    public EvaluationController(EvaluationService service){
        this.service = service;
    }

    @RequestMapping (method= RequestMethod.POST)
    public ResponseEntity addEvaluation(Evaluation evaluation){
        return ResponseEntity.ok(service.addEvaluation(evaluation));

    }
}
