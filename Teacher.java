
public class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses = new String[30];

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) return false;
        }
        courses[numCourses++] = course;
        return true;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false;
    }
    public void printCourses() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Mata kuliah yang diajar: " + courses[i]);
        }
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}
