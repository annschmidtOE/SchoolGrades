import java.util.ArrayList;

public class School {

  private int[] studentGrades;
  private ArrayList<Student> students;
  private final UI ui = new UI();

  public void createGrades() {
    for (int j = 0; j < studentGrades.length; j++) {
      studentGrades[j] =
          ui.getGrade("Enter your grade (" + (((j) + 1) + "/" + studentGrades.length) + ") : ");
    }
  }

  public void run() {
    createStudent();
    ui.printStudent(students);
  }

  public int answerCountStudent() {
    return ui.getInt("Enter a number of student you wanna create: ");
  }

  public void createStudent() {
    students = new ArrayList<>();

    int studentCount = answerCountStudent();

    for (int i = 0; i < studentCount; i++) {
      System.out.println();
      studentGrades = new int[7];

      String studentName = ui.getString("Enter a student name: ");

      createGrades();

      students.add(new Student(studentName, studentGrades));
    }
  }
}
