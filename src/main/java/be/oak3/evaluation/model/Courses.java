package be.oak3.evaluation.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity(name="courses")
public class Courses {
//
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    //private Set<Courses> courses;

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

//    public Set<Courses> getCourses() {
//        return courses;
//    }
//
//    @ManyToMany(mappedBy = "courses")
//
//    public void setCourses(Set<Courses> courses) {
//        this.courses = courses;
//    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
