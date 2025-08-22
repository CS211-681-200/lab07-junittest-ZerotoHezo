package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList studentList ;

        @BeforeEach
    void init() {
            studentList = new StudentList();
            studentList.addNewStudent("6859412344", "Kem",40);
            studentList.addNewStudent("6859412345", "Ked");
            studentList.addNewStudent("6859412346", "Kes");

        }

    @Test
    void testAddNewStudent(){
            studentList.addNewStudent("6859412347", "Kef");
            assertEquals("Kef" , studentList.findStudentById("6859412347").getName());

    }

    @Test
    void testFindStudentById(){
            assertEquals("Kem",studentList.findStudentById("6859412344").getName());
    }

    @Test
    void testFilterByName(){
            assertEquals("Ked" , studentList.filterByName("Ked").findStudentById("6859412345").getName());
    }

    @Test
    void testGiveScoreToId(){
            studentList.giveScoreToId("6859412344", 20);
            assertEquals(60 , studentList.findStudentById("6859412344").getScore());
    }

    @Test
    void testViewGradeOfId(){
            assertEquals("F",studentList.viewGradeOfId("6859412344"));
    }

}