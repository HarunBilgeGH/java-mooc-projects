package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class MemberTest {

    @Test
    public void membersWithSameIdAreEqual() {
        Member memberFirst = new Member("Harun",1);
        Member memberSecond = new Member("Mehmet",1);

        assertEquals(memberFirst,memberSecond);
    }

    @Test
    public void membersWithDifferentIdAreNotEqual() {
        Member memberFirst = new Member("Harun",1);
        Member memberSecond = new Member("Mehmet",2);

        assertNotEquals(memberFirst,memberSecond);
    }

    @Test
    public void memberToStringIsCorrect() {
        Member memberFirst = new Member("Harun",1);
        assertEquals("Harun (#1)", memberFirst);
    }
}