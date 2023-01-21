/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.edu.student.Custom;

/**
 *
 * @author Богдан
 */
public class Subject {
    String name;
    int score;
    boolean pass;
    
    public Subject(){}

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public boolean isPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
        if(score > 60)this.pass = true;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }
    
}
