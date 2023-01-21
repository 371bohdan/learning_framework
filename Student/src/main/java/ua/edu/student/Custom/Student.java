/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.edu.student.Custom;


import java.math.BigInteger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Богдан
 */
public class Student {
    private  Document doc;
    
    public Document getDoc(){
        return doc;
    }
    
    public void setDoc(Document id) {
        this.doc = id;
    }


    private String name;
    private String surname;
    private String age;
    private String email;
    private String group;
    private String faculty;


    
    public Student(){};
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    public String getFaculty() {
        return faculty;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
