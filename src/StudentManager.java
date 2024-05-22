public class StudentManager {
    Student[] students;
    Grade[][] grades;
    int size;

    public StudentManager() {
        this.students = new Student[10];
        this.grades = new Grade[10][10];
        this.size = 0;
    }

    public void addStudent(Student student) {
        if (size < students.length) {
            students[size++] = student;
        } else {
            System.out.println("Student database is full. Cannot add more students.");
        }
    }

    public void addGrade(Student student, String subject, double grade) {
        for (int i = 0; i < size; i++) {
            if (students[i] == student) {
                for (int j = 0; j < grades[i].length; j++) {
                    if (grades[i][j] == null) {
                        grades[i][j] = new Grade(student, subject, grade);
                        return;
                    }
                }
                System.out.println("Student " + student.name + " already has maximum number of grades.");
                return;
            }
        }
        System.out.println("Student not found in database.");
    }

    public double getAverageGrade(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i] == student) {
                double sum = 0;
                int count = 0;
                for (int j = 0; j < grades[i].length && grades[i][j] != null; j++) {
                    sum += grades[i][j].grade;
                    count++;
                }
                return count == 0 ? 0 : sum / count;
            }
        }
        System.out.println("Student not found in database.");
        return 0;
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("John", 1, 20);
        Student student2 = new Student("Alice", 2, 22);

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

        studentManager.addGrade(student1, "Math", 90);
        studentManager.addGrade(student1, "Physics", 85);
        studentManager.addGrade(student2, "Math", 95);
        studentManager.addGrade(student2, "Physics", 88);

        System.out.println("Average grade for " + student1.name + ": " + studentManager.getAverageGrade(student1));
        System.out.println("Average grade for " + student2.name + ": " + studentManager.getAverageGrade(student2));
    }
}
