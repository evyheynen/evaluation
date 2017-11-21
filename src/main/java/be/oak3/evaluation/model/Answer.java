package be.oak3.evaluation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Answer {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String answerOpen;

    @NotNull
    private Scale answerEnum;

    @NotNull
    private boolean answerYesNo;

    public Answer() {
    }

    public Answer(int id, String answerOpen, Scale answerEnum, boolean answerYesNo) {
        this.id = id;
        this.answerOpen = answerOpen;
        this.answerEnum = answerEnum;
        this.answerYesNo = answerYesNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswerOpen() {
        return answerOpen;
    }

    public void setAnswerOpen(String answerOpen) {
        this.answerOpen = answerOpen;
    }

    public Scale getAnswerEnum() {
        return answerEnum;
    }

    public void setAnswerEnum(Scale answerEnum) {
        this.answerEnum = answerEnum;
    }

    public boolean isAnswerYesNo() {
        return answerYesNo;
    }

    public void setAnswerYesNo(boolean answerYesNo) {
        this.answerYesNo = answerYesNo;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answerOpen='" + answerOpen + '\'' +
                ", answerEnum=" + answerEnum +
                ", answerYesNo=" + answerYesNo +
                '}';
    }
}
