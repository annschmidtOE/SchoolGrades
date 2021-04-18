import java.util.Scanner;

public class UI {

  private final Scanner scan = new Scanner(System.in);

  public String getString(String message) {
    System.out.print(message);
    return scan.nextLine();
  }

  public int getInt(String message) {
    System.out.print(message);
    return validateInt();
  }

  public int getGrade(String message) {
    System.out.print(message);
    return SevenScaleValidate();
  }

  public void printStudent(Student student, double averageGrade) {

    printStudentName(student);
    printGrades(student.getGrades());
    printAverageGrade(averageGrade);

    System.out.println();
  }

  /*
  //Old code
  public void printStudent(ArrayList<Student> students, double[] averageGrade) {
    for (int i = 0; i < students.size(); i++) {
      System.out.print("\nStudent name: ");
      System.out.println(students.get(i).getName());
      printGrades(students.get(i).getGrades());

      System.out.printf("Average grade: %.1f %n", averageGrade[i]);
      System.out.println();
    }
  }
   */

  public void printGrades(int[] grades) {
    int j = 1;
    for (int grade : grades) {
      System.out.println("Grade " + (j) + ". " + grade);
      j++;
    }
  }

  public void printStudentName(Student student) {
    System.out.print("\nStudent name: ");
    System.out.println(colorText("yellow", student.getName()));
  }

  public void printAverageGrade(double averageGrade) {
    System.out.printf("Average grade: %.1f %n", averageGrade);
  }

  public int validateInt() {
    while (!scan.hasNextInt()) {
      getString(colorText("red", "Invalid input, enter a new number: "));
    }
    int nextNumber = scan.nextInt();
    scan.nextLine();

    return nextNumber;
  }

  public int SevenScaleValidate() {
    int grade = validateInt();

    while (!(grade == -3
        || grade == 00
        || grade == 02
        || grade == 4
        || grade == 7
        || grade == 10
        || grade == 12)) {
      grade = getInt(colorText("red", "Invalidate grade, enter a new grade: "));
    }

    return grade;
  }


  //Color coding
  public String colorText(String colorIndex, String text) {
    // ANSI codes
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_CYAN = "\u001B[36m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_PURPLE = "\u001B[35m";

    String color = switch (colorIndex.toLowerCase()) {
      case "red" -> ANSI_RED;
      case "yellow" -> ANSI_YELLOW;
      case "purple" -> ANSI_PURPLE;
      case "blue" -> ANSI_BLUE;
      case "green" -> ANSI_GREEN;
      case "cyan" -> ANSI_CYAN;
      default -> ANSI_RESET;
    };

    return color + text + ANSI_RESET;
  }
}
