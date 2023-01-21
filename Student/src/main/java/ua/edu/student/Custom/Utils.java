/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.edu.student.Custom;

/**
 *
 * @author Богдан
 */
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.HashSet;
import ua.edu.student.CustomExceptions.AverageException;
import ua.edu.student.CustomExceptions.EmailException;
import ua.edu.student.Custom.Student;
import java.math.BigInteger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.edu.student.Custom.Document;
import ua.edu.student.Custom.Subject;




public class Utils{

    
    public static String getDomainEmail(String email){
        // substring - влаштований в Java метод, що дозволяє для певної строки
        // виконувати зріз, перший параметр - виконує обріз із початку, другий(за бажанням),
        // відсікає кінець строки, інтервал між строками - це ваш готовий продукт
        return email.substring(email.indexOf("@")+1);
    }
    public static boolean matchesDomain(String domen){
        //Виконуємо регулярні вирази $- кінцевий символ, ^ - початковий символ([] - символи)
        String regexDomain = "^[a-zA-Z0-9_.]+@[a-zA-Z0-9_.]+.[a-zA-Z0-9_]$";
        /*compile(щось)  - дає змогу відобразити регулярний вираз, складений  автором
        * matcher(щось) - співпадіння одного регулярного виразу
        * matches() - повертає результат співпаадіння true чи false
        * можно так Pattern.compile(стандарт).matcher(проба).matches()
        */
        return Pattern.matches(regexDomain, domen);
    }
    
    
    /**
     *
     * @param studs
     * @return
     */
    public static String calculatePopularEmail(LinkedList<Student> studs) throws EmailException{
        //Map - клас, що дає можливість створити ключ - значення в певному об'єкті
        Map<String, Integer> mails = new HashMap<String, Integer>();
        String tempDomain = "";
        String popularDomain = "";
        int count = 0;
        //цикл, що подібний за мовою Python чи JavaScript
        for(Student studen:studs){
            if(Utils.matchesDomain(studen.getEmail())){
                tempDomain = Utils.getDomainEmail(studen.getEmail());
                if(mails.containsKey(tempDomain)){
                    count = mails.get(tempDomain);
                }
                else{
                    count = 1;
                    }
            mails.put(tempDomain, count);
            }
            else{throw new EmailException();}
        }
            // Set - це колекція, що не містить дублікатів значень
            // keySet - метод Map,що через точкову нотацію зберігає ключі,
            // в даному випадку від об'єкта mails(що є змінною із ключами та значеннями)
        Set<String> keys = mails.keySet();
        int max = 0;
        for(String current:keys){
            if(max < mails.get(current)){
                max = mails.get(current);
                popularDomain = current;
            }
        }
        return popularDomain;
    }
   
    /**
     *
     * @param studs
     * @return
     */
    

    public static int calculateMinAge(LinkedList<Student> studs) {
        int currentAge = 0;
        for(Student stud:studs){
            if(currentAge == 0){
                currentAge = Integer.parseInt(stud.getAge());
            }
            int age = Integer.parseInt(stud.getAge());
            
            if(age <= currentAge){
                currentAge = age;
            }
        }
        return currentAge;
    }
    
    public static int calculateMaxAge(LinkedList<Student> studs){
      int currentAge = 0;
        for(Student stud:studs){
            if(currentAge == 0){
                currentAge = Integer.parseInt(stud.getAge());
            }
            int age = Integer.parseInt(stud.getAge());
            
            if(age >= currentAge){
                currentAge = age;
            }
        }
        return currentAge;
    }
    
    
    public static double calculateAverageAge(LinkedList<Student> studs) throws AverageException{
        double tempAge=0;
        int count=0;
        for(Student st:studs){
            int age=Integer.parseInt(st.getAge());
            if(age>0){
            tempAge+=age;
            count++;
            }
            else{
                throw new AverageException();
            }
        }
        if(count==0){return -1;}
        return tempAge/count;
    }
    
    
    public static int calculateEmailSumdu(LinkedList<Student> studs){
        int count = 0;
        for(Student stud:studs){
            String studEmailSumdu = stud.getEmail();
            if(studEmailSumdu.contains("sumdu")){
                count++;
            }
        }
        return count;
    }
    public static int calculateCountGroup(LinkedList<Student> studs){
        int count = 0;
        String groupName;
        Set<String> groupList = new HashSet<String>();
        for(Student stud:studs){
           groupName = stud.getGroup();
           if(groupList.contains(groupName) == false){
               groupList.add(groupName);
               count++;
           }
        }
        return count;
    }
    
}