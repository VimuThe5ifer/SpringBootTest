package com.vimuthe5ifer.springTest.model;

import jakarta.persistence.*;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.io.Serializable;

@Entity
public class employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private String name;
    private String phone;
    private String email ;
    private String jobTitle;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public employee(){}

    public employee(String name, String phone, String email, String jobTitle, String imageUrl, String employeeCode) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.jobTitle = jobTitle;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
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

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", jobTitle=" + jobTitle + ", imageUrl=" + imageUrl + ", employeeCode=" + employeeCode + "]";
    }

}
