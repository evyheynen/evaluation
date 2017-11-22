package be.oak3.evaluation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "courses")
public class Courses {
    //
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

//    @ManyToMany(mappedBy = "courses")
//    private Set<Instructor> instructors;

    public Courses() {
    }

    public Courses(int id, String name) {
        this.id = id;
        this.name = name;
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


    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
