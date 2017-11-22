package be.oak3.evaluation.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "evaluation")
public class Evaluation {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private LocalDateTime date;

    @NotNull
    private int course_id;

    @NotNull
    private int instructor_id;

    @NotNull
    private int student_id;


    @OneToMany
    @JoinColumn(name="evaluation_id")
    private List<Answer> answers;

    public Evaluation() {
    }

    public Evaluation(int student, int instructor, int course) {
        this.student_id = student;
        this.instructor_id = instructor;
        this.course_id = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse() {
        return course_id;
    }

    public void setCourse(int course) {
        this.course_id = course;
    }

    public int getInstructor() {
        return instructor_id;
    }

    public void setInstructor(int instructor) {
        this.instructor_id = instructor;
    }

    public int getStudent
            () {
        return student_id;
    }

    public void setStudent(int student) {
        this.student_id = student;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "student=" + student_id +
                ", instructor" + instructor_id +
                '}';
    }
}


