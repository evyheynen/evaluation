package be.oak3.evaluation.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity(name="instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String company;

    @ManyToMany
    //@JoinTable(name = "courses_instructor", joinColumns = @JoinColumn(name = "courses_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "instructor_id", referencedColumnName = "id"))
    private Set<Courses> courses;

    @OneToMany
    @JoinColumn(name="instructor_id")
    private List<Evaluation> evaluations;

    public Instructor(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public Instructor() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
