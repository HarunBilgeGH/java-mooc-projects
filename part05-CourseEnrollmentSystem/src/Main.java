public class Main {
    public static void main(String[] args) {
        Student ada = new Student("Ada", 20, 30);
        Student linus = new Student("Linus", 21, 5);

        Course java = new Course("JAVA101", "Programming I", 10);
        Course algorithms = new Course("ALG201", "Algorithms", 25);

        StudyOffice office = new StudyOffice();

        SimpleDate firstDay = new SimpleDate(1, 1, 2026);
        SimpleDate secondDay = firstDay.afterNumberOfDays(10);

        System.out.println(office.enroll(ada, java, firstDay));
        System.out.println(office.enroll(ada, algorithms, secondDay));
        System.out.println(office.enroll(linus, algorithms, secondDay));

        System.out.println(office.enrollmentCount());
        System.out.println(office.rejectedEnrollments());

        System.out.println(office.isEnrolled(ada, java));
        System.out.println(office.isEnrolled(linus, algorithms));

        System.out.println(office.latestEnrollmentOf(ada));
    }
}