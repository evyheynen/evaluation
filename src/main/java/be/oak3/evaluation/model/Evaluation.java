package be.oak3.evaluation.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Evaluation {

    private Student student;
    private Instructor instructor;
    private List<Question> questions;
    private List<Answer> answer;
    private int id;

    public Evaluation() {
    }

    public Evaluation(Student student, Instructor instructor, List<Question> questions, List<Answer> answer) {
        this.student = student;
        this.instructor = instructor;
        this.questions = questions;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "student=" + student +
                ", instructor" + instructor +
                ", questions=" + questions +
                ", answer=" + answer +
                '}';
    }
}


