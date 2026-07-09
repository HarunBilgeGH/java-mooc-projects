public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (this.month == 12 && this.day == 30) {
            this.day = 1;
            this.month = 1;
            this.year++;
        }
        else if (this.day == 30) {
            this.day = 1;
            this.month++;
        }
        else {
            this.day++;
        }
    }

    public void advance(int days) {
        if (this.month == 12 && this.day == 30-days) {
            this.day = 1;
            this.month = 1;
            this.year++;
        }
        else if (this.day == 30-days) {
            this.day = 1;
            this.month++;
        }
        else {
            this.day +=days;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate yeni = new SimpleDate(this.day, this.month, this.year);
        yeni.advance(days);
        return yeni;
}

    public boolean before(SimpleDate compared) {
        if (this == compared) {
            return false;
        }
        if (!(compared instanceof SimpleDate)) {
            return false;
        }
        SimpleDate comparedDate = (SimpleDate) compared;
        if (comparedDate.year > this.year) {
            return true;
        }
        else if (comparedDate.month > this.month) {
            return true;
        }
        else if (comparedDate.day > this.day) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.day + ":" + this.month + ":" + this.year;
    }
}