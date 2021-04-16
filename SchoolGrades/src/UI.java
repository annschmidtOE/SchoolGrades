import java.util.ArrayList;
import java.util.Scanner;

public class UI {

  private Scanner scan = new Scanner(System.in);

  public String getString(String message) {
    System.out.print(message);
    return scan.next();
  }

  public int getInt(String message) {
    System.out.println(message);
    return scan.nextInt();
  }

  public int getGrade(String message) {
    System.out.println(message);
    return scan.nextInt();
  }

  public void printStudent(ArrayList<Student> students) {

    for (int i = 0; i < students.size(); i++) {
      System.out.print("\nStudent name: ");
      System.out.println(students.get(i).getName());
      printGrades(students.get(i).getGrades());
    }
  }

  public void printGrades(int[] grades) {
    int j = 1;
    for (int grade : grades) {
      System.out.println("Grade " + (j) + ". " + grade);
      j++;
    }
  }
}
