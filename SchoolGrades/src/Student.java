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

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Student name: ").append(name);
        for (int i = 0; i < grades.length; ++i) {
            stringBuilder.append("Garde " + (i) + ". " + grades[i]);
        }

        return stringBuilder.toString();
    }
}
