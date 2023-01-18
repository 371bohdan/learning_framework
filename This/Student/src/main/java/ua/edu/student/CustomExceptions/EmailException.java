/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.edu.student.CustomExceptions;

/**
 *
 * @author Богдан
 */
public class EmailException extends Exception{
    public EmailException(){
        super("неправильний домен");
    }
}

