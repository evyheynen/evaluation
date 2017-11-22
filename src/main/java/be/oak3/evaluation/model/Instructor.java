package be.oak3.evaluation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String company;

    //private Set<Instructor> instructors;

    public Instructor(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public Instructor() {
    }

//    public Set<Instructor> getInstructors() {
//        return instructors;
//    }

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

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "courses_instructor", joinColumns = @JoinColumn(name = "courses_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "instructor_id", referencedColumnName = "id"))
//    public void setInstructors(Set<Instructor> instructors) {
//        this.instructors = instructors;
//    }
}
