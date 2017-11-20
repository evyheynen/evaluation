package be.oak3.evaluation.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Evaluation {


    private Student student;
    private Teacher teacher;
    private List<Question> questions;
    private List<Answer> answer;

    public Evaluation() {
    }

    public Evaluation(Student student, Teacher teacher, List<Question> questions, List<Answer> answer) {
        this.student = student;
        this.teacher = teacher;
        this.questions = questions;
        this.answer = answer;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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
                ", teacher=" + teacher +
                ", questions=" + questions +
                ", answer=" + answer +
                '}';
    }
}


