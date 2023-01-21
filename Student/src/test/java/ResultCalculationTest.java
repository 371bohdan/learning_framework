/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.edu.student.Custom.*;
import ua.edu.student.CustomExceptions.EmailException;
import ua.edu.student.CustomExceptions.AverageException;


/**
 *
 * @author Богдан
 */
public class ResultCalculationTest {
    static LinkedList<Student> students;
    static ApplicationContext factory = new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");
    static Student student = (Student)factory.getBean("Student");
    
    @BeforeAll
    public static void setupData(){
        students = new LinkedList<>();
            student.setName("Test");
            student.setSurname("Test");
            student.setEmail("many@gamail.com");
            student.setGroup("11");
            student.setFaculty("test");
            students.add(student);
        }
      

    @Test
    public void getEmailDomainTest(){
    String result=Utils.getDomainEmail("test@gmail.com");
    assertEquals(result,"gmail.com");
    }
    
    /*@Test
    public void whenExceptionThrown_thenExpectationSatisfied() throws EmailException {
        if (students == null){
            students = new LinkedList<Student>();
        }
        student.setName("Test");
        student.setSurname("Test");
        student.setAge("-1");
        student.setEmail("glovo@sumdu.ua.com");
        student.setGroup("23");
        student.setFaculty("test");
        students.add(student);
    	Assertions.assertThrows(EmailException.class, () -> {
		Utils.calculatePopularEmail(students);
	});
    students.remove(3);
    }*/
    @Test
    public void matchesDomainTest() {
    String emailAddress = "anonim@domain.com";
    assertTrue(Utils.matchesDomain(emailAddress));
    }
    /*@Test
    public void calculatePopularEmailTest() throws EmailException{
    String result=Utils.calculatePopularEmail(students);
    assertEquals("test.ua",result);
    }*/
   /* @Test
    public void calculateAverageAge() throws AverageException{
    double result=Utils.calculateAverageAge(students);
    assertEquals("21",result);
    }*/
}
