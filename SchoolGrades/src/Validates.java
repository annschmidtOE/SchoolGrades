import java.util.Scanner;

public class Validates {

  public int validateInt(Scanner scan) {
    while (!scan.hasNextInt()) {
      System.out.print("Enter a number: ");
      scan.next();
    }

    int nextNumber = scan.nextInt();
    scan.nextLine();

    return nextNumber;
  }

  


}
