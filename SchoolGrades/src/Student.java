public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        setName(name);
        setGrades(grades);
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }

}
