import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {

  static int[] studentGrades;
  static ArrayList<Student> students = new ArrayList<>();

  static Scanner scan = new Scanner(System.in);

  public void createStudent() {
    System.out.print("Enter a number of student you wanna create: ");
    int studentCount = validateInt();

    for (int i = 0; i < studentCount; i++) {
      System.out.println();
      studentGrades = new int[7];

      System.out.print("Enter a student name: ");
      String studentName = scan.next();

      for (int j = 0; j < studentGrades.length; j++) {
        System.out.print("Enter your grade (" + (((j) + 1) + "/" + studentGrades.length) + ") : ");
        studentGrades[j] = scan.nextInt();
      }

      students.add(new Student(studentName, studentGrades));
    }
  }

  public int validateInt() {
    while (!scan.hasNextInt()) {
      System.out.print("Enter a number: ");
      scan.next();
    }

    int nextNumber = scan.nextInt();
    scan.nextLine();

    return nextNumber;
  }

  public void showStudent() {
    for (int i = 0; i < students.size(); i++) {
      System.out.println();
      System.out.print("Student name: ");
      System.out.println(students.get(i).getName());

      int j = 1;
      for (int grade : students.get(i).getGrades()) {
        System.out.println("Grade " + (j) + ". " + grade);
        j++;
      }
    }
  }

  public void run() {
    createStudent();
    showStudent();
  }

  public MainStudent() {}

  public static void main(String[] args) {
    new MainStudent().run();
  }
}
