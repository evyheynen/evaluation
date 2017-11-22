package be.oak3.evaluation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "evaluation")
public class Evaluation {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private int course;

    @NotNull
    private int instructor;

    @NotNull
    private int student;


    public Evaluation() {
    }

    public Evaluation(int student, int instructor, int course) {
        this.student = student;
        this.instructor = instructor;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getInstructor() {
        return instructor;
    }

    public void setInstructor(int instructor) {
        this.instructor = instructor;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "student=" + student +
                ", instructor" + instructor +
                '}';
    }
}


