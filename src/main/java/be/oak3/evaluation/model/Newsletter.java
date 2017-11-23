package be.oak3.evaluation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Newsletter {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private int student_id;
    @NotNull
    private int course_id;
    @NotNull
    private boolean newsletter;

    public Newsletter() {
    }

    public Newsletter(int student_id, int course_id, boolean newsletter) {
        this.student_id = student_id;
        this.course_id = course_id;
        this.newsletter = newsletter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }
}
