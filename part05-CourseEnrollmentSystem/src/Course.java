public class Course {
    private String code;
    private String name;
    private int requiredCredits;

    public Course(String code, String name, int requiredCredits) {
        this.code = code;
        this.name = name;
        this.requiredCredits = requiredCredits;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public int getRequiredCredits() {
        return this.requiredCredits;
    }

    public boolean canEnroll(Student student) {
        return student.getCredits() >= this.getRequiredCredits();
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Course)) {
            return false;
        }
        Course comparedCourse = (Course) compared;
        if (comparedCourse.getCode().equals(this.getCode())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.requiredCredits;
    }
}