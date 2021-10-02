package tech.getarrays.sass_employee_manager.manager;

import tech.getarrays.sass_employee_manager.employee.Employee;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Manager implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String qualification;
    private int age;
    private String phoneNumber;
    private String imageURL;
    @OneToMany()
    private List<Employee> employees;

    public Manager() {
    }

    public Manager(String firstName, String lastName, String qualification, int age, String phoneNumber, String imageURL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.qualification = qualification;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.imageURL = imageURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
