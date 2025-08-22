package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentHardCodeDatasource d = new StudentHardCodeDatasource();
    @Test
    void testReadData(){
        StudentList list = d.readData();
        assertNotNull(list);
        assertEquals(4,list.getStudents().size() );


    }

}