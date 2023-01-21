/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.edu.student.Custom;

/**
 *
 * @author Богдан
 */
public class ResultCalculation {
    
    private static ResultCalculation instance;//to perform Singleton
    
    private static double averageAge;
    private static int minAge;
    private static int maxAge;
    private static String popularEmail;
    private static int countEmailSumdu;
    private static int countGroup;
    private static int countStudens;



    private ResultCalculation(){   
    }
    
    
    
    public static ResultCalculation getInstance() {//to perform Singleton
        if(instance==null){instance=new ResultCalculation();}
        return instance;
    } 
    
    //
    public static double getAverageAge() {
        return averageAge;
    }

    public static void setAverageAge(double averageAge) {
        ResultCalculation.averageAge = averageAge;
    }
    
    //
    
    public static int getMinAge() {
        return minAge;
    }
    
    public static void setMinAge(int minAge){
        ResultCalculation.minAge = minAge;
    }
    
    //
    
    public static int getMaxAge() {
        return maxAge;
    }
    
    public static void setMaxAge(int maxAge) {
        ResultCalculation.maxAge = maxAge;
    }
    
    //
    
    public static String getPopularEmail() {
        return popularEmail;
    }
    
    public static void setPopularEmail(String popularEmail) {
        ResultCalculation.popularEmail = popularEmail;
    }
    
    //
    
    public static int getCountEmailSumdu() {
        return countEmailSumdu;
    }

    public static void setCountEmailSumdu(int countEmailSumdu) {
        ResultCalculation.countEmailSumdu = countEmailSumdu;
    }
    
    //

    public static int getCountGroup() {
        return countGroup;
    }

    public static void setCountGroup(int countGroup) {
        ResultCalculation.countGroup = countGroup;
    }
    
    
    //
    public static int getCountStudens() {
        return countStudens;
    }
        
    public static void setCountStudens(int countStudens) {
        ResultCalculation.countStudens = countStudens;
    }
    
}
