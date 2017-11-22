package be.oak3.evaluation.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    public Answer(int id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
