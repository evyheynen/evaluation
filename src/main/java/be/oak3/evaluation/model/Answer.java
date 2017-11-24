package be.oak3.evaluation.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "answers")
public class Answer {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private int question_id;
    @NotNull
    private int evaluation_id;
    @NotNull
    private String answer;


    public Answer() {
    }

    public Answer(String answer, int question_id, int evaluation_id) {
        this.answer = answer;
        this.question_id= question_id;
        this.evaluation_id=evaluation_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getEvaluation_id() {
        return evaluation_id;
    }

    public void setEvaluation_id(int evaluation_id) {
        this.evaluation_id = evaluation_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
