package be.oak3.evaluation.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String company;
    @NotNull
    private String email;

    @OneToMany(mappedBy = "evaluation")
    private List<Evaluation> evaluations = new ArrayList<>();

    public Student() {
    }

    public Student(int id, String name, String company, String email) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                '}';
    }
}
