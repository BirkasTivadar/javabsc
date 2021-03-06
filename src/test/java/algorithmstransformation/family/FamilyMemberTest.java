package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FamilyMemberTest {

    @Test
    void testCreate() {
        FamilyMember familyMember = new FamilyMember("Kiss Béla", 56);

        assertEquals("Kiss Béla", familyMember.name());
        assertEquals(56, familyMember.age());
    }
}
