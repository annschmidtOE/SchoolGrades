import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    //Act
    double[] actual = school.averageGrades();

    double expected = 8.5;

    //Assert
    assertEquals(expected, actual[0]);
  }
}