package be.oak3.evaluation.model;

import javax.validation.constraints.NotNull;

public class Student extends Person {
    @NotNull
    private String email;

    public Student() {
    }

    public Student(int id, String name, String company, String email1) {
        super(id, name, company);
        this.email = email1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                '}';
    }
}
