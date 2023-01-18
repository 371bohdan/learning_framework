/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import ua.edu.student.Custom.*;
import ua.edu.student.CustomExceptions.EmailException;
import ua.edu.student.CustomExceptions.AverageException;


/**
 *
 * @author Богдан
 */
public class ResultCalculationTest {
    static LinkedList<Student> studs;
    @BeforeAll
    public static void setupData(){
        studs=new LinkedList<>();
        studs.add(new Student("Test1","Test1","18","test1@test.ua","test","test"));
        studs.add(new Student("Test2","Test2","25","test2@test.ua","test","test"));
        studs.add(new Student("Test3","Test3","20","test3@test.ua","test","test"));
    }
    @Test
    public void getEmailDomainTest(){
    String result=Utils.getDomainEmail("test@gmail.com");
    assertEquals(result,"gmail.com");
    }
    
    @Test
    public void whenExceptionThrown_thenExpectationSatisfied() throws EmailException {
    studs.add(new Student("Exception","Exception","-1","email","test","test"));
    	Assertions.assertThrows(EmailException.class, () -> {
		Utils.calculatePopularEmail(studs);
	});
    studs.remove(3);
    }
    @Test
    public void matchesDomainTest() {
    String emailAddress = "anonim@domain.com";
    assertTrue(Utils.matchesDomain(emailAddress));
    }
    @Test
    public void calculatePopularEmailTest() throws EmailException{
    String result=Utils.calculatePopularEmail(studs);
    assertEquals("test.ua",result);
    }
    @Test
    public void calculateAverageAge() throws AverageException{
    double result=Utils.calculateAverageAge(studs);
    assertEquals(21,result);
    }
}
