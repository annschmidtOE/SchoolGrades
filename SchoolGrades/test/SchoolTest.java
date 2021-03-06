import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.image.Raster;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

  School school;

  @BeforeEach
  void setup(){
    //Arrange
    school = new School();
  }

  @Test
  void averageGrade() {

    //Arrange happens in setup

    int[] grades = {10, 10, 10, 4};

    Student student1 = new Student("Ras", grades);

    //Act
    double actual = school.averageGrades(student1);

    double expected = 8.5;

    //Assert
    assertEquals(expected, actual);
  }


}