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
}
