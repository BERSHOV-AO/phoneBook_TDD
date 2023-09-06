import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Мария", "89500000001"));
        assertEquals(2, phoneBook.add("Алексей", "89500000002"));
        assertEquals(2, phoneBook.add("Алексей", "89500000055"));
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Мария", "89500000011");
        phoneBook.add("Алексей", "89500000022");
        assertNull(phoneBook.findByNumber("89500000000"));
        assertEquals("Мария", phoneBook.findByNumber("89500000011"));
        assertEquals("Алексей", phoneBook.findByNumber("89500000022"));
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Мария", "89500000011");
        phoneBook.add("Алексей", "89500000022");
        assertNull(phoneBook.findByName("Илья"));
        assertEquals("89500000011", phoneBook.findByName("Мария"));
        assertEquals("89500000022", phoneBook.findByName("Алексей"));
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Мария", "89500000011");
        phoneBook.add("Алексей", "89500000022");
        phoneBook.add("Илья", "89500000033");
        assertEquals("Алексей, Илья, Мария", phoneBook.printAllNames());
    }
}
