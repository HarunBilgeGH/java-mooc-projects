import java.util.ArrayList;

public class StudyOffice {
    private ArrayList<Enrollment> enrollments;
    private int rejectedEnrollments;

    public StudyOffice() {
        this.enrollments = new ArrayList<>();
        this.rejectedEnrollments = 0;
    }

    public boolean enroll(Student student, Course course, SimpleDate date) {
        if (course.canEnroll(student)) {
            Enrollment enrollment = new Enrollment(student, course, date);
            enrollments.add(enrollment);
            return true;
        }
        this.rejectedEnrollments++;
        return false;
    }

    public int enrollmentCount() {
        return enrollments.size();
    }

    public int rejectedEnrollments() {
        return this.rejectedEnrollments;
    }

    public boolean isEnrolled(Student student, Course course) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.isForStudent(student) && enrollment.isForCourse(course)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Enrollment> enrollmentsOf(Student student) {
        ArrayList<Enrollment> studentsEnrollments = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if (enrollment.isForStudent(student)) {
                studentsEnrollments.add(enrollment);
            }
        }
        return studentsEnrollments;
    }

    public Enrollment latestEnrollmentOf(Student student) {
        Enrollment latest = null;
        for (Enrollment enrollment : enrollmentsOf(student)) {
            if (latest.getDate().before(enrollment.getDate())) {
                latest = enrollment;
            } 
        }
        return latest;
    }
}