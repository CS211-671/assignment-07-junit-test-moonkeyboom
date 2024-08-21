package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList list;

    @BeforeEach
    void init() {
        list = new StudentList();
        list.addNewStudent("6611111111", "Mook", 80);
    }

    @Test
    @DisplayName("ทดสอบ getStudents()")
    void testGetStudents() {
        assertEquals(1,list.getStudents().size());
    }

    @Test
    @DisplayName("ทดสอบ addNewStudent()")
    void testAddNewStudent() {
        assertEquals(1,list.getStudents().size());
        list.addNewStudent("6611111112", "Moo");
        assertEquals(2,list.getStudents().size());

        list.addNewStudent("6611111113", "Moop", 90);
        assertEquals(3,list.getStudents().size());
    }


    @Test
    @DisplayName("ทดสอบ findStudentById()")
    void testFindStudentById() {
        assertEquals("Mook", list.findStudentById("6611111111").getName());
    }

    @Test
    @DisplayName("ทดสอบ giveScoreToId()")
    void testGiveScoreToId() {
        list.giveScoreToId("6611111111", 1);
        assertEquals(81,list.findStudentById("6611111111").getScore());
    }

    @Test
    @DisplayName("ทดสอบ viewGradeOfId()")    void testViewGradeOfId() {
        assertEquals("A", list.viewGradeOfId("6611111111"));

    }

}