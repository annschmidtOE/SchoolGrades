import java.util.ArrayList;

public class School {

  private int[] studentGrades;
  private ArrayList<Student> students;
  private final UI ui = new UI();

  public void run() {
    createStudent();
    showStudents();
    //ui.printStudent(students, averageGrades(students));
  }

  public void showStudents(){

    for (int i = 0; i < students.size(); i++) {
      ui.printStudent(students.get(i), averageGrades(students.get(i)));
    }
  }


  public int answerCountStudent() {
    return ui.getInt("Enter a number of student you wanna create: ");
  }

  public void createGrades() {
    studentGrades = new int[7];

    for (int j = 0; j < studentGrades.length; j++) {
      studentGrades[j] =
          ui.getGrade("Enter your grade (" + (((j) + 1) + "/" + studentGrades.length) + ") : ");
    }
  }


  public void createStudent() {
    students = new ArrayList<>();

    int studentCount = answerCountStudent();

    for (int i = 0; i < studentCount; i++) {
      System.out.println();

      String studentName = ui.getString("Enter a student name: ");

      createGrades();

      students.add(new Student(studentName, studentGrades));
    }
  }


  public double averageGrades(Student student) {

    int[] grades = student.getGrades();
    double result = 0.0;

    for (int j = 0; j < grades.length; j++) {
      result += grades[j];
    }
    return result / grades.length;
  }


  /*
  //Old code
  public double[] averageGrades(ArrayList<Student> student) {
    //The parameter is not necessary, but need it for the Unit test
    //Instead of the parameter you can grab student from the class

    double[] result = new double[student.size()];

    for (int i = 0; i < student.size(); i++) {
      double resultGrades = 0;
      int[] grades = student.get(i).getGrades();

      for (int j = 0; j < grades.length; j++) {
        resultGrades += grades[j];
      }
      result[i] = resultGrades / grades.length;
    }

    return result;
  }

   */


}
