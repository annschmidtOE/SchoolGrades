import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UITest {

  UI ui;

  @BeforeEach
  void setup(){
    //Arrange
    ui = new UI();
  }

  @Test
  void averageGrade() {

    //Arrange happens in setup

    int[] grades = {10, 10, 10, 4};

    //Act
    double actual = ui.printAverageGrade(grades);

    double expected = 8.5;

    //Assert
    assertEquals(expected, actual);
  }
}