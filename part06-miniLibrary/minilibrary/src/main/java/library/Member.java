package library;

public class Member {
    private String name;
    private int memberId;
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return this.name;
    }
    public int getMemberId() {
        return this.memberId;
    }

    @Override
    public boolean equals(Object compared) {
    if (this == compared) {
        return true;
    }

    if (!(compared instanceof Member)) {
        return false;
    }

    Member comparedMember = (Member) compared;

    return this.memberId == comparedMember.getMemberId();
}

    @Override
    public String toString() {
        return this.name +" (#" + this.memberId + ")";
    }
}
