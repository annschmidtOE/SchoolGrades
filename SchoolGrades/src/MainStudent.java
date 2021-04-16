public class MainStudent {

  UI ui;

  public void run() {
    ui.createStudent();
    ui.showStudent();
  }

  public MainStudent() {
    ui = new UI();
  }

  public static void main(String[] args) {
    new MainStudent().run();
  }
}
