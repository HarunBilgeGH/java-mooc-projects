public class Enrollment {
    private Student student;
    private Course course;
    private SimpleDate date;

    public Enrollment(Student student, Course course, SimpleDate date) {
        this.student = student;
        this.course = course;
        this.date = date;
    }

    public Student getStudent() {
        return this.student;
    }

    public Course getCourse() {
        return this.course;
    }

    public SimpleDate getDate() {
        return this.date;
    }

    public boolean isForStudent(Student student) {
        return student.equals(this.student);
    }

    public boolean isForCourse(Course course) {
        return course.equals(this.course);
    }

    @Override
    public String toString() {
        return this.student + " " + this.course + " " + this.date;
    }
}   