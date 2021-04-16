import java.util.ArrayList;
import java.util.Scanner;

public class UI {

  private final Scanner scan = new Scanner(System.in);

  public String getString(String message) {
    System.out.print(message);
    return scan.next();
  }

  public int getInt(String message) {
    System.out.print(message);
    return scan.nextInt();
  }

  public int getGrade(String message) {
    System.out.print(message);
    return SevenScaleValidate(scan);
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

  public int validateInt(Scanner scan) {
    while (!scan.hasNextInt()) {
      getString("Enter a number: ");
    }
    int nextNumber = scan.nextInt();
    scan.nextLine();

    return nextNumber;
  }

  public int SevenScaleValidate(Scanner scan) {
    int grade = validateInt(scan);

    while (!(grade == -3
        || grade == 00
        || grade == 02
        || grade == 4
        || grade == 7
        || grade == 10
        || grade == 12)) {
      grade = getInt("Invalidate grade, enter a new grade: ");
    }

    return grade;
  }
}
