import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number of student you wanna create: ");
    int studentCount = scan.nextInt();

    int[] studentGrades;
    ArrayList<Student> students = new ArrayList<>();

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
}
