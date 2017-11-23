package be.oak3.evaluation.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Evaluation {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "date", columnDefinition="DATETIME")
    private Date date;

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

    public Evaluation(Date date, int course_id, int instructor_id, int student_id) {
        this.date = date;
        this.course_id = course_id;
        System.out.println(course_id);
        this.instructor_id = instructor_id;
        this.student_id = student_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "student=" + student_id +
                ", instructor" + instructor_id +
                '}';
    }
}


