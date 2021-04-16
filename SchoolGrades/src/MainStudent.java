import java.util.Scanner;

public class MainStudent {

  Handler handler;
  Scanner scan;

  public void run() {
    handler.createStudent(scan);
    handler.showStudent();
  }

  public MainStudent() {
    handler = new Handler();
    scan = new Scanner(System.in);
  }

  public static void main(String[] args) {
    new MainStudent().run();
  }
}
