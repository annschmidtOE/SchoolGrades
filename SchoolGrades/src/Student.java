public class Student {
    private String name;
    private int[] grades;

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
}
