public class Student {
    private String name;
    private int age;
    private int credits;

    public Student(String name) {
    this(name, 0, 0);
    }

    public Student(String name, int age) {
        this(name, age, 0);
    }

    public Student(String name, int age, int credits) {
        this.name = name;
        this.age = age;
        this.credits = credits;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getCredits() {
        return this.credits;
    }

    public void growOlder() {
        this.age += 1;
    }

    public void addCredits(int amount) {
        if (amount >= 0) {
            this.credits +=amount;
        }
    }

    public boolean hasEnoughCredits(int requiredCredits) {
        return (this.credits >= requiredCredits);
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.credits;
    }
}