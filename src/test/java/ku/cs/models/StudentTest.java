package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @BeforeEach
    void init(){
        student = new Student("67ccccccc" , "pra") ;
    }

    @Test
    @DisplayName("Add 20 and 50")
    void testAddScore(){
        student.addScore(20);
        assertEquals(20,student.getScore());
        student.addScore(50);
        assertEquals(70,student.getScore());
    }

    @Test
    void testCalculateGrade(){
        student.addScore(80);
        assertEquals("A",student.getGrade());
    }
    @Test
    void testChangeName(){
        student.changeName("Pem") ;
        assertEquals("Pem",student.getName());
    }

    @Test
    void testisId(){
        assertEquals(true , student.isId(student.getId()));
    }

    @Test
    void testisName(){
        assertEquals(true, student.isNameContains(student.getName()));
    }



}