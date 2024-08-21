package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s;

    @BeforeEach
    void init() {
        s = new Student("6xxxxxxxx", "StudentTest");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
        s.addScore(10);
        assertEquals(55.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 90 คะแนน")
    void testAddScoreMook(){
        s.addScore(90);
        assertEquals(90, s.getScore());

    }



    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบ getName() และ getId()")
    void testGetName() {
        Student s = new Student("6611111111", "StudentTest");
        assertEquals("StudentTest", s.getName());
        assertEquals("6611111111", s.getId());
    }

    @Test
    @DisplayName("ทดสอบ changeName()")
    void testChangeName() {
        s.changeName("Mook");
        assertEquals("Mook", s.getName());
    }


    @Test
    @DisplayName("ทดสอบ getScore()")
    void testGetScore() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
    }

    @Test
    void testIsId() {
        Student s = new Student("611111111", "StudentTest");
        assertTrue(s.isId("611111111"));
        assertFalse(s.isId("6611111110"));
    }


    @Test
    void testToString() {
        Student s = new Student("6611111111", "StudentTest");
        assertEquals("{id: '6611111111', name: 'StudentTest', score: 0.0}", s.toString());

    }
}